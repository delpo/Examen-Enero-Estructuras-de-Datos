package ej4jun12;

import java.util.LinkedList;

public class ProbadorGradoMax {

	public static void main(String[] args){
		
		LinkedList<ArbolGeneral<Integer>> hijos = new LinkedList<ArbolGeneral<Integer>>();
		LinkedList<ArbolGeneral<Integer>> hijos2 = new LinkedList<ArbolGeneral<Integer>>();
		

		ArbolGeneral<Integer> misubarbol = new ArbolGeneral<Integer>();
		ArbolGeneral<Integer> misubarbol2 = new ArbolGeneral<Integer>();
		
		
		ArbolGeneral<Integer> arbol = new ArbolGeneral<Integer>(27, hijos);
		
		hijos.add(misubarbol);
		
		misubarbol.setRaiz(2);
		misubarbol.setHijos(hijos2);
		
		misubarbol2.setRaiz(4);
		misubarbol2.setHijos(null);
		hijos2.add(misubarbol2);
		
		System.out.println("El grado m�ximo es: "+arbol.getGradoMax());
		
	}
	
}

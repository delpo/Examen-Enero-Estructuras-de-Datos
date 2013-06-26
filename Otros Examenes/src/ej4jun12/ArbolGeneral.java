package ej4jun12;

import java.util.Iterator;
import java.util.LinkedList;

public class ArbolGeneral<T> {
	private T raiz ;
	private LinkedList < ArbolGeneral <T > > hijos ;

	public ArbolGeneral(){
		
	}
	
	public ArbolGeneral(T raiz,  LinkedList < ArbolGeneral <T > > hijos){
		this.setRaiz(raiz);
		this.setHijos(hijos);
	}

	public T getRaiz() {
		return raiz;
	}

	public void setRaiz(T raiz) {
		this.raiz = raiz;
	}

	public LinkedList < ArbolGeneral <T > > getHijos() {
		return hijos;
	}

	public void setHijos(LinkedList < ArbolGeneral <T > > hijos) {
		this.hijos = hijos;
	}

	public int getGradoMax() {
		int gradomax = 0;
		
		for (Iterator<ArbolGeneral<T>> i = hijos.iterator(); i.hasNext();) {
		      int candidato = i.next().getGradoMax();
		      if(candidato > gradomax) gradomax = candidato;
		}
		
		gradomax++;
		return gradomax;
	}
		
}

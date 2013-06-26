package ej3jun12;

public class Monticulo {
	
	private String[] vector;
	private int MAX_SIZE = 100;
	
	public Monticulo(){
		vector =  new String[MAX_SIZE];
	}
	
	public Monticulo(String root){
		vector[0] = root;
	}
	
	public void anyadir(String elemento){
		anyadir(0, elemento);
	}

	private int anyadir(int index, String elemento) {
		int i = 0;
		if(index > MAX_SIZE){
			System.out.println("error");
			i = -1;
		}else if(vector[index] == null){
			vector[index] = elemento;
			return 1;
		}else if(vector[index].compareTo(elemento) == 0){
			//ya est� el elemento, supongo que no pueden haber repetidos
			i = 2;
		}else if(vector[index].compareTo(elemento) < 0){
			//hijo derecho
			anyadir(2*index+2, elemento);
		}else{
			//hijo izquierdo
			anyadir(2*index+1, elemento);
		}	
		return i;
	}
	
	public String get(int i){
		return vector[i];
	}
}

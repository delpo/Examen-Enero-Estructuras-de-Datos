package ej3jun12;

public class ProbadorMonticulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Monticulo mont = new Monticulo ();
		mont.anyadir("1");
		mont.anyadir("2");
		mont.anyadir("3");
		mont.anyadir("10");
		mont.anyadir("19");
		mont.anyadir("6");
		mont.anyadir("2");
		mont.anyadir("0");
		mont.anyadir("2");
		mont.anyadir("4");
		for(int i = 0; i < 50; i++){
			System.out.print(mont.get(i)+" ");
		}
	}

}

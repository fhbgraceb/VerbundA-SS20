package bspAusDemUnterricht;

public class Glasbefuellen {

	static int einglas = 50;
	static final int max = 100;

	public static void main(String[] args) {

		System.out.println(nachf�llen(30));

		System.out.println(nachf�llen(10));

		System.out.println(nachf�llen(10));
		
		}

	private static String nachf�llen(int i) {

		if ((i + einglas) >= max) {

			return "Soviel kann ich nicht nachf�llen";

		} else {

			einglas += i;
			return "Wurde nachgef�llt, neue Menge ist: " + einglas;
		}

	}



}

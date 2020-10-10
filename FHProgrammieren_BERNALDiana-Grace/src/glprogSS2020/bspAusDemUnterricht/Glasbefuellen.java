package bspAusDemUnterricht;

public class Glasbefuellen {

	static int einglas = 50;
	static final int max = 100;

	public static void main(String[] args) {

		System.out.println(nachfüllen(30));

		System.out.println(nachfüllen(10));

		System.out.println(nachfüllen(10));
		
		}

	private static String nachfüllen(int i) {

		if ((i + einglas) >= max) {

			return "Soviel kann ich nicht nachfüllen";

		} else {

			einglas += i;
			return "Wurde nachgefüllt, neue Menge ist: " + einglas;
		}

	}



}

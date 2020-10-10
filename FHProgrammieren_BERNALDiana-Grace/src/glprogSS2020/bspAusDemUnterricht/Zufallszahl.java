package bspAusDemUnterricht;

public class Zufallszahl {

	public static void main(String[] args) {
		
		for(int i = 0; i < 100; i++)
		System.out.println(zufallzahl(8, 9));
		

	}

public static int zufallzahl(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}
}

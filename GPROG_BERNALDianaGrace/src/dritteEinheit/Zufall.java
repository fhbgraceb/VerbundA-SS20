package dritteEinheit;

import java.util.concurrent.ThreadLocalRandom;

public class Zufall {

	public static void main(String[] args) {
		
		int zufallszahl=0;
		String pwd="";
		
		for (int i = 0; i < 9; i++) {
			zufallszahl = ThreadLocalRandom.current().nextInt(20, 100);
			
			pwd=pwd + (char) zufallszahl;
		}
		
		System.out.println("ihr pw" + pwd);
	}

}

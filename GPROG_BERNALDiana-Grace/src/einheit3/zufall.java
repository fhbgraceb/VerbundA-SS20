package einheit3;

import java.util.concurrent.ThreadLocalRandom;

public class zufall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String pwd = "";
		
		for (int i = 0; i < 9; i++) {
		
		
		int zufallszahl = ThreadLocalRandom.current().nextInt(20, 130);
		pwd = pwd + (char) zufallszahl;
		
		
		}
		
		System.out.println("Ihr Passwort lautet: " + pwd);
		
	}

}

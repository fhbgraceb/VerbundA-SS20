package BernalHausuebung4;

public class f_groesser10 {
	/*
	 6. Groesser10: Ab welchem n ist die (Summe der) Reihe
	1 + ½ + 1/3 + ¼ + ... + 1/n
	größer als 10?

	 */

	public static void main(String[] args) {
		System.out.print("f_groesser10_____________________\n");
		
		double reihe = 0;
		double glieder = 0;
		double oldc = 10;
		
		while (reihe <= oldc){
			glieder++;
			reihe += 1 / glieder;
		}

		System.out.println("Ab dem " + glieder + ". Glied ist die Reihe größer als " + oldc + ".");

	}

}

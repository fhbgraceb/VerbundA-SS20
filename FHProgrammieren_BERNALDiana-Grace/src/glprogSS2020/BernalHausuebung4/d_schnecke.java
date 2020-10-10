package BernalHausuebung4;

public class d_schnecke {
	/*
	 4. Schnecke: Eine Schnecke sitzt vor einer 4,5 Meter hohen Mauer. Jeden Tag
		klettert sie 50 cm nach oben, in jeder Nacht rutscht sie 10% ihrer momentanen
		Gesamthöhe nach unten. An welchem Tag ist sie oben?
 
	 */

	public static void main(String[] args) {
		System.out.print("d_schnecke_____________________\n");
		
		double hoehe = 450;
		double schnecke = 0;
		int zaehler = 0;
		boolean slide=true;
			
		while (slide){
			schnecke=tag(schnecke);
			
			if (schnecke >= hoehe) {

				slide = false;
				System.out.println("Schnecke kommt nach " + zaehler + " Tagen an.");
				System.out.println("Sie steht bei " + schnecke + " cm.");
			}else {
				schnecke=nacht(schnecke);
			}
			zaehler++;
		}
		

	}
	
	static double tag(double num) {
		num = num + 50;
		return num;
	}

	static double nacht(double num) {
		num = num - (num / 10);
		return num;
	}

}

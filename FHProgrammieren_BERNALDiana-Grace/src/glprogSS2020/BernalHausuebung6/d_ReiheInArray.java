package BernalHausuebung6;

public class d_ReiheInArray {
	
	/* Berechnen Sie die Reihe
		1 + ½ + 1/3 + ¼ + 1/5 + ...
		also
		1 ; 1 + ½ ; 1 + ½ + 1/3 ; ...
		bis zum 100. Glied (1 + ... + 1/100) und speichern Sie diese in einem Array. 
		Geben Sie danach nur die ungeraden Elemente des Arrays (das 1., 3., 5., ... ) aus.
	*/

	public static void main(String[] args) {
		double[] reihenglieder = new double[101];
		double glied;
		double summe;
		
		summe = 0;

		for (int i = 1; i <= 100; i++){
			glied = 1.0 / (double)i;
			summe += glied;
			reihenglieder[i] = summe;
		}
		
		for (int i = 1; i <= 100; i += 2){
			System.out.println(reihenglieder[i]);
		}
	}

}

package BernalHausuebung6;

public class c_FolgeInArray {
	
	/* Berechnen Sie die Folge
			1 ; ½ ; 1/3 ; ¼ ; 1/5 ; ...
		bis zum 100. Glied (1/100) und speichern Sie alle Glieder in einem Array. 
		Geben Sie danach nur die geraden Elemente des Arrays (das 2., 4., 6., ... ) aus.
	*/

	public static void main(String[] args) {
		double[] folgenglieder = new double[101]; 
		
		for (int i = 1; i <= 100; i++){
			folgenglieder[i] = 1 / (double)i;
		}
		
		for (int i = 2; i <= 100; i += 2){
			System.out.println(folgenglieder[i]);
		}
	}

}

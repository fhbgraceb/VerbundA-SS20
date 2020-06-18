package aufgabe05_Prog2018;

/*
 * Beispielgruppe 4 - Schleifen
 * 
 * Groesser10: 
 * 
 * Ab welchem n ist die (Summe der) Reihe
 * 
 * 1 + ½ + 1/3 + ¼ + ... + 1/n
 * 
 * 	größer als 10?
 */
public class Groesser10 
{

	public static void main(String[] args) 
	{
		double reihe = 0;
		double glieder = 0;
		double grenze = 10;	// Um andere Berechungen zu erleichtern
		
		while (reihe <= grenze)
		{
			glieder++;
			reihe += 1 / glieder;
		}

		System.out.println("Ab dem " + glieder + ". Glied ist die Reihe größer als " + grenze + ".");
	}

}

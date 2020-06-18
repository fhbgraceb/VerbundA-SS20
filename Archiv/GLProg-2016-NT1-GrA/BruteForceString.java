package _glProg_2016_NT1_A;

public class BruteForce {

	/*
	Erstellen Sie ein zufälliges Wort, das aus 5 Zeichen besteht. Die ersten drei Zeichen sind Großbuchstaben gefolgt von 2 Ziffern.
	(Format: BBBZZ, Beispiel: „GNK15“ oder „ABC12“ oder „KUL01“).
Versuchen Sie nun mittels der Brute-Force-Methode das zuvor erstellte Wort herauszufinden. Geben Sie die Anzahl der Versuche aus,
die dazu benötigt werden.

	* */

	public static void main(String[] args) 
	{
		String code = "";
		String test = "";
		int versuche = 0;
		int anzahl = 0;
		
		for (int i = 1; i <= 3; i++) 
		{
			code += (char)(int)(Math.random() * ((int)'Z' - (int)'A' + 1) + (int)'A');
		}
		for (int i= 1; i <= 2; i++) 
		{
			code += (char)(int)(Math.random() * ((int)'9' - (int)'0' + 1) + (int)'0');			
		}
		
		System.out.println(code);
		
		for (char b1 = 'A'; b1 <= 'Z'; b1++) 
		{
			for (char b2 = 'A'; b2 <= 'Z'; b2++) 
			{
				for (char b3 = 'A'; b3 <= 'Z'; b3++) 
				{
					for (char z1 = '0'; z1 <= '9'; z1++) 
					{
						for (char z2 = '0'; z2 <= '9'; z2++) 
						{
							versuche++;
							test = "" + b1 + b2 + b3 + z1 + z2;
							if (code.equals(test)) 
							{
								anzahl = versuche;
							}
						}								
					}		
				}
			}
		}
		
		System.out.println("Anzahl der Versuche: " + anzahl);
	}

}

package ersteHausuebung;

import java.util.Scanner;

public class Haustueroffner {

	public static void main(String[] args) {
		
		
/*		Angabe zur Übung 1 nun online. Zusätzlich zu den Beispielen im Eclipse-Projekt, 
		gilt es noch einen BMI-Rechner mit Benutzereingabe, Kennzahl inkl. einer Empfehlung - 
		zB optimal, zu dünn/dick, etc. 
		sowie einen "Haustüröffnungsprozess" abzulichten, 
		Haus und Tür müssen korrekt sein, Anlehnung an Algo- bzw. Passwordlogin-BSP, 
		jedoch mit einer kleinen Adaption, dass Haus kann mit 2 Schlüsseln 
		aufgesperrt werden. Beide öffnen die Tür, sofern es sich um das korrekt Haus handelt.
*/
		//bin mir unsicher ob ich die Aufgabenstellung richtig verstanden habe, aber hier mal was ich so mitgerkriegt hab:
		//RICHTIGE eingabe wäre: Haus 6; Tür 3; Schlüssel 5 ODER Schlüssel 1
		
		Scanner scanner = new Scanner(System.in);
		
		//Haus auswählen
		String[] haeuserStrings = {"1.Grünes Haus", "2.Blaues Haus", "3.Gelbes Haus","4.Lila Haus","5.Blech Haus","6.Bamboo Haus","7.Oranges Haus","8.Rosa Haus"};
		
		for (int i = 0; i < haeuserStrings.length; i++) {
			System.out.println(haeuserStrings[i] + " ");
		}
		
		System.out.println("Wählen Sie ein Haus aus indem Sie die Zahl eingeben:");
		int hausOption = (scanner.nextInt()) - 1;
		
		//Tür auswählen
		String[] tuer = {"1.Grüne Tür","2.Blaue Tür","3.Gelbe Tür","4.Lila Tür","5.Braune Tür","6.Glas Tür","7.Orange Tür","8.Rosa Tür"};

		for (int j = 0; j < tuer.length; j++) {
			System.out.println(tuer[j] + " ");
		}
		
		System.out.println("Wählen Sie einen Tür aus indem Sie die Zahl eingeben:");
		int tuerOption = (scanner.nextInt())-1;
		
		//Schluessel auswählen
		String[] Schluessel = {"1.Grüner Schlüssel","2.Blauer Schlüssel","3.Gelber Schlüssel","4.Lila Schlüssel","5.Kupfer Schlüssel","6.Eisen Schlüssel","7.Oranger Schlüssel","8.Rosa Schlüssel"};
		
		for (int k = 0; k < Schluessel.length; k++) {
			System.out.println(Schluessel[k] + " ");
		}
		
		System.out.println("Wählen Sie einen Schlüssel aus indem Sie die Zahl eingeben:");
		int schluesselOption = (scanner.nextInt())-1;
		
		if (hausOption==5 && tuerOption==2 && schluesselOption==4 || schluesselOption==0) {
			System.out.println("Trette ein!");
			System.out.println(" ______________");
			System.out.println("|\\ ___________ /|");
			System.out.println("| |  /|,| |   | |");
			System.out.println("| | |,x,| |   | |");
			System.out.println("| | |,x,' |   | |");
			System.out.println("| | |,x   ,   | |");
			System.out.println("| | |/    |%==| |");
			System.out.println("| |    /] ,   | |");
			System.out.println("| |   [/ ()   | |");
			System.out.println("| |       |   | |");
			System.out.println("| |       |   | |");
			System.out.println("| |       |   | |");
			System.out.println("| |      ,'   | |");
			System.out.println("| |   ,'      | |");
			System.out.println("|_|,'_________|_|");
			System.out.println("Trette ein!");
		}else {
			System.out.println("Access denied...");
		}
		
		scanner.close();
		
	}
}

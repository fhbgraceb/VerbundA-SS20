package ersteHausuebung;

import java.util.Scanner;

public class Haustueroffner {

	public static void main(String[] args) {
		
		
/*		Angabe zur �bung 1 nun online. Zus�tzlich zu den Beispielen im Eclipse-Projekt, 
		gilt es noch einen BMI-Rechner mit Benutzereingabe, Kennzahl inkl. einer Empfehlung - 
		zB optimal, zu d�nn/dick, etc. 
		sowie einen "Haust�r�ffnungsprozess" abzulichten, 
		Haus und T�r m�ssen korrekt sein, Anlehnung an Algo- bzw. Passwordlogin-BSP, 
		jedoch mit einer kleinen Adaption, dass Haus kann mit 2 Schl�sseln 
		aufgesperrt werden. Beide �ffnen die T�r, sofern es sich um das korrekt Haus handelt.
*/
		//bin mir unsicher ob ich die Aufgabenstellung richtig verstanden habe, aber hier mal was ich so mitgerkriegt hab:
		//RICHTIGE eingabe w�re: Haus 6; T�r 3; Schl�ssel 5 ODER Schl�ssel 1
		
		Scanner scanner = new Scanner(System.in);
		
		//Haus ausw�hlen
		String[] haeuserStrings = {"1.Gr�nes Haus", "2.Blaues Haus", "3.Gelbes Haus","4.Lila Haus","5.Blech Haus","6.Bamboo Haus","7.Oranges Haus","8.Rosa Haus"};
		
		for (int i = 0; i < haeuserStrings.length; i++) {
			System.out.println(haeuserStrings[i] + " ");
		}
		
		System.out.println("W�hlen Sie ein Haus aus indem Sie die Zahl eingeben:");
		int hausOption = (scanner.nextInt()) - 1;
		
		//T�r ausw�hlen
		String[] tuer = {"1.Gr�ne T�r","2.Blaue T�r","3.Gelbe T�r","4.Lila T�r","5.Braune T�r","6.Glas T�r","7.Orange T�r","8.Rosa T�r"};

		for (int j = 0; j < tuer.length; j++) {
			System.out.println(tuer[j] + " ");
		}
		
		System.out.println("W�hlen Sie einen T�r aus indem Sie die Zahl eingeben:");
		int tuerOption = (scanner.nextInt())-1;
		
		//Schluessel ausw�hlen
		String[] Schluessel = {"1.Gr�ner Schl�ssel","2.Blauer Schl�ssel","3.Gelber Schl�ssel","4.Lila Schl�ssel","5.Kupfer Schl�ssel","6.Eisen Schl�ssel","7.Oranger Schl�ssel","8.Rosa Schl�ssel"};
		
		for (int k = 0; k < Schluessel.length; k++) {
			System.out.println(Schluessel[k] + " ");
		}
		
		System.out.println("W�hlen Sie einen Schl�ssel aus indem Sie die Zahl eingeben:");
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

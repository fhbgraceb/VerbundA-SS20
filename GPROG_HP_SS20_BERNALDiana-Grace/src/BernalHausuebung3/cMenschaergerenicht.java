package BernalHausuebung3;

public class cMenschaergerenicht {
	/*
	 Aufgabe 3) Mensch �rgere dich nicht
	Genau 2 Spieler spielen auf einem Spielfeld mit 50 aufeinanderfolgenden Feldern (kein Kreis!). 
	Jeder Spieler hat nur einen Spielstein. Die Spieler w�rfeln abwechselnd 
	und d�rfen die gew�rfelten Punkte am Spielfeld ziehen. Steht bereits der Gegenspieler auf dem Feld, 
	welches gew�rfelt wurde, wird dieser �herausgeschmissen� und muss wieder neu beginnen. 
	Wenn der Spieler �herausgeschmissen� wurde und sein Spielstein nicht am Spielfeld steht 
	(wie das auch beim Start des Spiels ist), darf der Spieler am Feld 1 beginnen, 
	wenn er eine �6� gew�rfelt hat. Sieger ist, wer zuerst am 50. Feld steht oder es �berschritten hat. 
	F�r das W�rfeln, die Methode ThreadLocalRandom.current??? verwenden, 
	alternativ �ber Random, bzw. Math.Random() -> siehe Skript
	Beispiel: Spieler 1 w�rfelt eine 4 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 2 w�rfelt eine 3 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 1 w�rfelt eine 6 und darf den Spielstein auf Feld 1 stellen 
	Spieler 2 w�rfelt eine 2 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 1 w�rfelt eine 3 und f�hrt auf Feld 4 (1 + 3 = 4) vor 
	Spieler 2 w�rfelt eine 6 und darf den Spielstein auf Feld 1 stellen 
	Spieler 1 w�rfelt eine 1 und f�hrt auf Feld 5 (4 + 1 = 5) vor 
	Spieler 2 w�rfelt eine 4 und f�hrt auf Feld 5 (1 + 4) vor und schmei�t dabei Spieler 1 raus 
	(Spieler 1 muss wieder neu beginne!) usw.
	 */

	public static void main(String[] args) {
		int spieler1=0;
		int spieler2=0;
		
		
		while (spieler1 < 50 || spieler2 < 50) {
			if (spieler1 > 0) {
				spieler1=spieler1 + Random(1,6);
				if (spieler1 == spieler2) {
					spieler2=0;
				}
			}else {
				spieler1=Random(1,6);
				if (spieler1==6) {
					spieler1=1;
				}else {
					spieler1=0;
				}
			}
					
			if (spieler2 > 0) {
				spieler2=spieler2+Random(1,6);
				if (spieler2==spieler1) {
					spieler1=0;
				}
			}else {
				spieler2=Random(1,6);
				if (spieler2==6) {
					spieler2=1;
				}else {
					spieler2=0;
				}
			}
			spieler1++;
			spieler2++;
		}//while ende
		
		if (spieler1 > spieler2) {
			System.out.println("Spieler 1 hat gewonnen! Spieler 2 verloren...");
		}else {
			System.out.println("Spieler 2 hat gewonnen! Spieler 1 verloren...\"");
		}

	}
	
	private static int Random(int untere, int obere) {
		int range = (obere - untere) + 1;     
	    return (int)(Math.random() * range) + untere;
	}
}

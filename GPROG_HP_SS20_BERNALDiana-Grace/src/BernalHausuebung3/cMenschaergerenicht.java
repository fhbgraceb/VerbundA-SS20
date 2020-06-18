package BernalHausuebung3;

public class cMenschaergerenicht {
	/*
	 Aufgabe 3) Mensch ärgere dich nicht
	Genau 2 Spieler spielen auf einem Spielfeld mit 50 aufeinanderfolgenden Feldern (kein Kreis!). 
	Jeder Spieler hat nur einen Spielstein. Die Spieler würfeln abwechselnd 
	und dürfen die gewürfelten Punkte am Spielfeld ziehen. Steht bereits der Gegenspieler auf dem Feld, 
	welches gewürfelt wurde, wird dieser „herausgeschmissen“ und muss wieder neu beginnen. 
	Wenn der Spieler „herausgeschmissen“ wurde und sein Spielstein nicht am Spielfeld steht 
	(wie das auch beim Start des Spiels ist), darf der Spieler am Feld 1 beginnen, 
	wenn er eine „6“ gewürfelt hat. Sieger ist, wer zuerst am 50. Feld steht oder es überschritten hat. 
	Für das Würfeln, die Methode ThreadLocalRandom.current??? verwenden, 
	alternativ über Random, bzw. Math.Random() -> siehe Skript
	Beispiel: Spieler 1 würfelt eine 4 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 2 würfelt eine 3 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 1 würfelt eine 6 und darf den Spielstein auf Feld 1 stellen 
	Spieler 2 würfelt eine 2 (und darf den Spielstein nicht auf Feld 1 stellen) 
	Spieler 1 würfelt eine 3 und fährt auf Feld 4 (1 + 3 = 4) vor 
	Spieler 2 würfelt eine 6 und darf den Spielstein auf Feld 1 stellen 
	Spieler 1 würfelt eine 1 und fährt auf Feld 5 (4 + 1 = 5) vor 
	Spieler 2 würfelt eine 4 und fährt auf Feld 5 (1 + 4) vor und schmeißt dabei Spieler 1 raus 
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

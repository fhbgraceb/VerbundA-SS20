package _glProg_2018_VZ_HT;

public class Dalmatiner {
/*
Oh, Shrek! Die Gartentür war wieder einmal offen und die 101 Dalmatiner sind davongelaufen.
Mickey, Donald und Goofy machen sich sofort auf den Weg um die Hunde wieder einzufangen.
Nach einer Stunde haben Sie einige, aber nicht alle, wieder eingefangen.
Es ist bekannt, dass die drei zusammen mehr als 17 Dalmatiner eingefangen haben.
Jeder hat zumindest einen mitgebracht.
Mickey hat mehr als doppelt so viele Hunde gefangen wie Donald und Goofy zusammen.
Donald hat 3 Hunde mehr gefangen als Goofy.
Geben Sie alle Möglichkeiten aus, wie viele Dalmatiner jeder der 3 gefangen haben kann.

* */
	public static void main(String[] args) {
		int anzahlDalamtiner = 101;
		
		for (int mickey = 1; mickey < anzahlDalamtiner; mickey++) {
			for (int donald = 1; donald < anzahlDalamtiner; donald++) {
				for (int goofy = 1; goofy < anzahlDalamtiner; goofy++) {
					int summe = mickey + donald + goofy;
					if ((summe < anzahlDalamtiner)  
						&& (summe > 17) 
						&& (mickey > (donald + goofy) * 2) 
						&& (donald == goofy + 3)) {
						System.out.println("Mickey: " + mickey + " Donald: " + donald + " Goofy: " + goofy);
					}
				}
			}
		}
	}

}

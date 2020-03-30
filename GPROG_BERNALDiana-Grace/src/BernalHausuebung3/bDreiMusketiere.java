package BernalHausuebung3;

public class bDreiMusketiere {
	/*
	Aufgabe 2) DreiMusketiere
	Die 3 Musketiere – Athos, Porthos und Aramis– kommen bei Ihren Reisen auch bei Schloss Camelot vorbei. 
	Nachdem die Ritter der Tafelrunde gerade anderweitig beschäftigt sind können sie ungestört durch das Schloss wandeln. 
	Dabei kommen sie auch in den großen Saal mit der runden Tafel mit 40 durchnummerierten Plätzen, 
	an der sie natürlich Platz nehmen müssen. Wie viele verschiedene Möglichkeiten gibt es für sie, 
	sich auf den 40 Plätzen zu verteilen, sodass zwischen zwei von ihnen immer mindestens ein Platz frei bleibt?
	Beispiel für eine erlaubte Platzierung:
	• Athos auf Platz 17
	• Porthos auf Platz 21
	• Aramis auf Platz 5
	Beispiel für eine nicht erlaubte Platzierung:
	• Athos auf Platz 27
	• Porthos auf Platz 26
	• Aramis auf Platz 33
	Hier sitzen Athos und Porthos direkt nebeneinander.
	 */

	public static void main(String[] args) {
		int counter=0;
		
		for (int athos = 1; athos <= 40; athos++) {
			for (int porthos = 1; porthos <= 40; porthos++) {
				for (int aramis = 1; aramis <= 40; aramis++) {
					if (athos!=porthos && porthos!=aramis && aramis!=athos && athos!=(porthos+1) && athos!=(aramis+1) && porthos!=(athos+1) && porthos!=(aramis+1) && aramis!=(athos+1) && aramis!=(porthos+1)) {
						counter++;
						System.out.println("Athos ist auf dem Platz: " + athos + "\nPorthos ist auf dem Platz: " + porthos + "\nAramis ist auf dem Platz: " + aramis + "\n");
					}
				}
			}
		}
		System.out.println("---------------------------------------------------");
		System.out.println("Es gibt " + counter + " Möglichkeiten.");
	}
}

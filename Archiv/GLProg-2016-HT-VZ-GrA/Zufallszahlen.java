package _glProh_2016_HT_VZ_GrA;

public class Zufallszahlen 
{

	/*
	* Erzeugen Sie 1221-mal 2 dreistellige Zufallszahlen und verfahren Sie mit den beiden Zahlen dann jeweils wie folgt:
Addieren Sie jeweils die beiden Hunderterstellen, die beiden Zehnerstellen und die beiden Einerstellen.
* Anschließend summieren Sie diese drei Summen.
Geben Sie die beiden Zufallszahlen in der Konsole nur dann aus, wenn die erste der beiden Zufallszahlen
* grösser ist als die zweite, oben beschriebene Summe größer als 38 ist und die Summe der Hunderterstellen
* ohne Rest durch die Summe der Einerstellen teilbar ist.
Geben Sie abschließend auch aus, wie viele Zahlenpaare die oben beschriebenen Kriterien erfüllen.
Ein mögliches Ergebnis wäre:

Erklärung (für das erste ausgegebene Zahlenpaar):
Das Zahlenpaar wurde ausgegeben weil:
	Die erste Zufallszahl (959) größer ist als die zweite (565)
	Summe der Hunderterstellen:		9 + 5 =	14
Summe der Zehnerstellen:		5 + 6 =	11
Summe der Einerstellen:		9 + 5 =	14
Aufsummiert:					39
 die Summe der Summen (39) größer als 38 ist
und die Summe der Hunderterstellen (14) ohne Rest durch die Summe der Einerstellen (14) teilbar ist.

	* */
	public static void main(String[] args) 
	{
		final int grenze = 38;
		final int wiederholungen = 1221;
		int zufallszahl1;
		int zufallszahl2;
		int rest1;
		int rest2;
		int hunderter;
		int zehner;
		int einer;
		int summe;
		int anzahl = 0;
		
		for (int i = 1; i <= wiederholungen; i++)
		{
			zufallszahl1 = zufallszahl();
			zufallszahl2 = zufallszahl();
			einer = (zufallszahl1 % 10) + (zufallszahl2 % 10);
			rest1 = (zufallszahl1 - (zufallszahl1 % 10)) /10;
			rest2 = (zufallszahl2 - (zufallszahl2 % 10)) /10;

			zehner = (rest1 % 10) + (rest2 % 10);
			rest1 = (rest1 - (rest1 % 10)) /10;
			rest2 = (rest2 - (rest2 % 10)) /10;

			hunderter = rest1 + rest2;
			summe = einer + zehner + hunderter;

			if ((zufallszahl1 > zufallszahl2)
				&& (summe > grenze)
				&& (hunderter % einer == 0))
			{
				System.out.println("Zahl1: " + zufallszahl1 + " Zahl2: " + zufallszahl2);
				anzahl++;
			}
		}
		System.out.println("Anzahl der Zahlenpaare: " + anzahl);
	}

	// Nachdem man die Zufallszahl �fters braucht, wurde gleich ein UP programmiert
	public static int zufallszahl()
	{
		return (int)(Math.random() * (999 - 100 + 1) + 100);
	}
}

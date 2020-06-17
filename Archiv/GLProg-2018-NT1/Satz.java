package _glProg_2018_nt1_WORK;

public class Satz {

	/*
	* Erstellen Sie ein Array, dass aus 5 verschiedenen Worten besteht.
Die Worte sind:
“Tag“, “ein“, “schöner“, “Heute“, “ist“
Bilden Sie nun 100000 mal aus diesen Worten einen zufälligen Satz,
* indem Sie 5 Mal zufällig ein Wort aus dem Array wählen, wobei ein Wort auch mehrmals im Satz vorkommen kann.
Zwischen den Worten soll im Satz jeweils ein Leerzeichen (‘  ‘) stehen.
Ein so gebildeter Satz könnte beispielsweise so aussehen:
„schöner ist heute Tag heute“
Lassen Sie nun in einem Unterprogramm prüfen, ob der jeweils gebildete Satz
"Heute ist ein schöner Tag"
lautet.
Geben Sie am Ende aus, wie oft der gewünschte Satz gebildet wurde.

	* */
	
	public static void main(String[] args) {
		String worte [] = {"Tag", "ein", "sch�ner", "Heute", "ist"};
		String satz;
		int counter = 0;
		final int anzahlWorte = 5;
		
		for (int i = 1; i < 100000; i++) 
		{
			satz = "";
			for (int j = 1; j <= anzahlWorte; j++) 
			{
				if (j > 1) 
				{
					satz += " ";
				}
				satz += worte[(int)(Math.random()*(5))];
			}
			//System.out.println(satz);
			if (checksatz(satz)) {
				counter++;
			}
		}
		System.out.printf("Der Satz \"Heute ist ein sch�ner Tag\" wurde %d mal zuf�llig erzeugt.", counter);
	}

	public static boolean checksatz(String satz) 
	{
		return satz.equals("Heute ist ein sch�ner Tag"); 
	}
}

package aufgabe09_Prog2018;

/*
 * zweitlaengsterString: 
 * 
 * Schreiben Sie ein Unterprogramm an das eine beliebige Anzahl
 * von Strings �bergeben werden kann und die den String mit der 
 * zweitgr��ten L�nge zur�ckliefert. 
 * Sollten dabei mehrere Strings die zweitgr��te L�nge haben, 
 * so wird der letzte davon zur�ckgeliefert.
 * 
 * Beispiel:
 * 
 * 	zweitlaengsterString("ABCD", "ABCDE", "QWER", "QWERT")
 * 
 * liefert als Ergebnis �QWER�, 
 * weil das der letzte String mit der zweitgr��ten L�nge (4) ist.
 * 
 * Anmerkung:
 * Das Einlesen der Strings war nicht Teil der Aufgabe.
 */
public class ZweitlaengsterString 
{

	public static String zweitlaengsterString(String[] worte)
	{
		String laengstes;
		String zweitlaengstes;
		String aktuelles;
		
		if (worte.length < 2)	// Zu wenige Worte �bergeben
		{
			return null;		// Um anzuzeigen, dass es zu wenige Worte waren
		}
		else
		{
			// Initialisieren
			laengstes = "";
			zweitlaengstes = "";
			// Alle Worte ansehen
			for (int i = 0; i < worte.length; i++)
			{
				aktuelles = worte[i];
				// Ist das Wort l�nger als das l�ngste?
				if (aktuelles.length() > laengstes.length())
				{
					zweitlaengstes = laengstes;
					laengstes = aktuelles;
				}
				else if (aktuelles.length() == laengstes.length())
				{
					laengstes = aktuelles;
				}
				else if (aktuelles.length() >= zweitlaengstes.length())
				{
					zweitlaengstes = aktuelles;
				}
			}
			return zweitlaengstes;
		}
	}
	
	public static void main(String[] args) 
	{
		String[] daten;

		// Testdaten:
		daten = new String[]{};
//		daten = new String[]{"ABCD", "ABCDE", "QWER", "QWERT"};
//		daten = new String[]{"ABCD", "ABCDE", "QWER", "QWERT", "ABCDEF"};	// Muss "QWERT" liefern, nicht "ABCDE"!
//		daten = new String[]{"ASDF", "QWER", "YXCV"};		// Alle gleich lang - kein zweitl�ngstes
		
		System.out.println(zweitlaengsterString(daten));
	}

}

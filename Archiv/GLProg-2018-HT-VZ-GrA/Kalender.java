package _glProg_2018_VZ_HT;

public class Kalender 
{

	/*
	Geben Sie für das Jahr 2018 alle Kalendertage nach angezeigtem Muster aus,
	indem Sie sie einfach untereinander in die Konsole schreiben.
1. Jänner 2018
2. Jänner 2018
…
31. Jänner 2018
1. Februar 2018
2. Februar 2018
…
1. Dezember 2018
2. Dezember 2018
…
31. Dezember 2018
Es gibt allerdings eine Einschränkung für diese Aufgabe: Es dürfen nur 2 Schleifen verwendet werden.

	* */

	public static void main(String[] args) 
	{
		final int jahr = 2018;
		String[] monate = new String[]{"J�nner", "Februar", "M�rz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
		int[] tage = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for (int monat = 0; monat < monate.length; monat++)
		{
			for (int tag = 1; tag <= tage[monat]; tag++)
			{
				System.out.println(tag + ". " + monate[monat] + " " + jahr);				
			}
		}
	}
}

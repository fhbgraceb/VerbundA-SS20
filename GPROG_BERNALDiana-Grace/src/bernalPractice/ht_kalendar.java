package bernalPractice;

public class ht_kalendar {
	public static void main(String[] args) 
	{
		final int jahr = 2018;
		String[] monate = new String[]{"Januar", "Februar", "Maerz", "April", "Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember"};
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

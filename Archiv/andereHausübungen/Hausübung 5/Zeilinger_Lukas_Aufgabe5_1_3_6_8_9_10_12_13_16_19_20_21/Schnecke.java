package Zeilinger_Lukas_Aufgabe5_1_3_6_8_9_10_12_13_16_19_20_21;

public class Schnecke {

	public static void main(String[] args) 
	{
		int hoehe = 450;
		final int day = 50;
		final double night = 0.1;
		
		int tagezaehler = 0;
		double schnecke = 0;
		
		while (schnecke < hoehe && tagezaehler != 200)
		{
			tagezaehler++;
			schnecke += day;
			schnecke = schnecke - (schnecke*night);
			//System.out.println(schnecke);
		}
		if (tagezaehler != 200) System.out.println("Die Schnecke braucht "+ tagezaehler+ " Tage!");
		if (tagezaehler == 200) System.out.println("Die Schnecke ist nie oben ;)");

	}

}

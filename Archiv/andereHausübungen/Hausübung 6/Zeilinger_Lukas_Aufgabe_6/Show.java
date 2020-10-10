package Zeilinger_Lukas_Aufgabe_6;

public class Show {

	public static void main(String[] args) 
	{
		String[] spieler = {"Lukas","Verena","Omar","Süheyla"};
		int[] wuerfeln = new int[spieler.length];
		int end = -1;
		final int OG = 6;
		final int UG = 1;
		
		while(end != 0)
		{
			for(int i = 0; i < spieler.length; i++)
			{
				wuerfeln[i] = (int)(Math.random()*(OG-UG+1)+1);
			}
			for(int i = 0; i < spieler.length; i++)
			{
				if(wuerfeln[i] == OG)
				{
					end = 0;
				}
			}
		}
		for(int i = 0; i < spieler.length; i++)
		{
			if(wuerfeln[i] == OG)
			{
				System.out.println(spieler[i]+" hat gewonnen!");
			}
		}

	}

}

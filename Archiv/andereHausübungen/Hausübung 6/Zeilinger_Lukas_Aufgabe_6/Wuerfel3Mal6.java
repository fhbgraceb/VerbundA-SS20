package Zeilinger_Lukas_Aufgabe_6;

public class Wuerfel3Mal6 {

	public static void main(String[] args) 
	{
		String[] spieler = {"Lukas","Verena","Omar","Süheyla"};
		int[] wuerfeln = new int[spieler.length];
		int end = -1;
		final int OG = 6;
		final int winner = 18;
		final int UG = 1;
		int zwischenspeicher = 0;
		
		while(end != 0)
		{
			for(int i = 0; i < spieler.length; i++)
			{
				zwischenspeicher = (int)(Math.random()*(OG-UG+1)+1);
				if(zwischenspeicher == 6)
				{
					wuerfeln[i] += zwischenspeicher;
				}
				
			}
			for(int i = 0; i < spieler.length; i++)
			{
				if(wuerfeln[i] == winner)
				{
					end = 0;
				}
			}
		}
		for(int i = 0; i < spieler.length; i++)
		{
			if(wuerfeln[i] == winner)
			{
				System.out.println(spieler[i]+" hat gewonnen!");
			}
		}


	}

}

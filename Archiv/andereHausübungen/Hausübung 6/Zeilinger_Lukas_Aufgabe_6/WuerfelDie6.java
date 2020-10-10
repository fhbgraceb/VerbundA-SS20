package Zeilinger_Lukas_Aufgabe_6;

public class WuerfelDie6 {

	public static void main(String[] args) 
	{
		String[] spieler = {"Lukas","Verena","Omar","Süheyla"};
		int[] wuerfeln = new int[4];
		int end = 1;
		
		while(end != 0)
		{
			for(int i = 0; i < spieler.length; i++)
			{
				wuerfeln[i] = (int)(Math.random()*(6-1+1)+1);
				//System.out.println(wuerfeln[i]);
			}
			for(int j = 0; j < spieler.length; j++)
			{
				if(wuerfeln[j] == 6)
				{
					end = 0;
				}
			}
		}
		for(int j = 0; j < spieler.length; j++)
		{
			if(wuerfeln[j] == 6)
			{
				System.out.println(spieler[j]+" hat gewonnen");
			}
		}
		

	}

}

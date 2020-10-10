package _glProg_2018_BB_HT;

public class Uhr 
{

	public static void main(String[] args) 
	{
		for (int std = 0; std < 24; std++)
		{
			for (int min = 0; min < 60; min++)
			{
				for (int sek = 0; sek < 60; sek++)
				{
					System.out.println(((std < 10) ? "0" : "") + std + ":" 
										+ ((min < 10) ? "0" : "") + min + ":" 
										+ ((sek < 10) ? "0" : "") + sek);
				}
			}
		}
	}

}

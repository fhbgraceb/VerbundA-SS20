package _glProg_2018_BB_HT;

public class UhrV2 
{

	public static void main(String[] args) 
	{
		for (int std = 0; std < 24; std++)
		{
			for (int min = 0; min < 60; min++)
			{
				for (int sek = 0; sek < 60; sek++)
				{
					System.out.printf("%02d:%02d:%02d\n", std, min, sek);
				}
			}
		}
	}

}

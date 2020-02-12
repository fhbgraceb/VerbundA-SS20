package _glProg_2018_nt1_WORK;

public class Piraten 
{

	public static void main(String[] args) 
	{
		final int maxSumme = 200;
		
		for (int rotbart = 26; rotbart < maxSumme; rotbart++)
		{
			for (int sven = 26; sven < maxSumme; sven++)
			{
				for (int harkan = 26; harkan < maxSumme; harkan++)
				{
					if ((rotbart + sven + harkan < maxSumme) && (rotbart > sven * 2) && (sven >= harkan + 4))
					{
						System.out.printf("Rotbart: %3d, Sven: %3d, Harkan: %3d\n", rotbart, sven, harkan);
					}
				}
			}
		}
	}

}

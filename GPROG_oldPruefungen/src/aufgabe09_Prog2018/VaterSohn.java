package aufgabe09_Prog2018;

public class VaterSohn 
{

	public static void main(String[] args) 
	{
		
		for (int vater = 15; vater <= 100; vater++)
		{
			for (int sohn = 5; sohn < vater; sohn++)
			{
				if (((vater - 5) == 5 * (sohn - 5)) && ((vater + 3) == 3 * (sohn + 3)))
				{
					System.out.printf("Heute ist der Vater %d und der Sohn %d Jahre alst.", vater, sohn);
				}
			}
		}
	}

}

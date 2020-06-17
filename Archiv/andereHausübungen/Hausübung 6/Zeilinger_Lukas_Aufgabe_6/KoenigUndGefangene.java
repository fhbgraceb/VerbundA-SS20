package HalloWorld;

public class KoenigUndGefangene {

	public static void main(String[] args) 
	{
		final int alterKing = 66;
		final int azZellen = 111;
		int[] zellen = new int[111];
		int counter = 0;
		
		//Zellen : 1 = offen 0 = zu
		for(int i = 0; i < azZellen; i++)
		{
			zellen[i] = 1;
		}
		
		for (int i = 2; i<= alterKing; i++)
		{
			for(int j = 1; j <= azZellen; j++)
			{				
				if (j % i == 0)
				{
					if(zellen[j-1] == 1) 
					{
						zellen[j-1] = 0; counter++;
					}
					if(zellen[j-1] == 0 && counter == 0)
					{
						zellen[j-1] = 1; counter++;
					}
					counter = 0;
				}
			}
		}
		counter = 0;
		for(int i = 0; i < azZellen; i++)
		{
			if(zellen[i] == 1)
				{
					System.out.println("Zelle Nr. "+(i+1)+ " ist jetzt offen");
					counter++;
				}
		}
		System.out.println(counter+" Gefangene dürfen nach Hause");

	}

}

package Zeilinger_Lukas_Aufgabe_6;

public class WuerfelStatistikArray {

	public static void main(String[] args) 
	{
		final int wuerfe = 100;
		int[] gewuerfelt = new int[wuerfe];
		int[] wuerfel = new int[6];
		int OG = 6;
		int UG = 1;
		
		for(int i = 0; i < wuerfe; i++)
		{
			gewuerfelt[i] = (int)(Math.random()*(OG-UG+1)+1);
			wuerfel[gewuerfelt[i]-1]++;
		}
		for(int i = 0; i < wuerfel.length; i++)
		{
			System.out.println("Die Zahl "+(i+1)+" wurde "+wuerfel[i]+"* gewürfelt!");
		}
		

	}

}

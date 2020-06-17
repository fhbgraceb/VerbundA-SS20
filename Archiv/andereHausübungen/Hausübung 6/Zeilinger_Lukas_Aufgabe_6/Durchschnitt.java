package Zeilinger_Lukas_Aufgabe_6;

import java.util.Scanner;

public class Durchschnitt {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		final int maximum = 50;
		final int end = 0;
		int zwischenspeicher = -1;
		double summe = 0;
		int counter = 0;
		int[] array = new int[maximum];
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Zahl "+(i+1)+" = ");
			zwischenspeicher = scan.nextInt();
			if (zwischenspeicher != end)
			{
				
				array[i]= zwischenspeicher;
				counter++;
			}
			else{
				i = maximum;
			}
			
		}
		for(int i = 0; i < counter;i++)
		{
			summe += array[i];
		}
		summe = summe /counter;
		System.out.println("Durchschnitt: "+ (summe));

	}

}

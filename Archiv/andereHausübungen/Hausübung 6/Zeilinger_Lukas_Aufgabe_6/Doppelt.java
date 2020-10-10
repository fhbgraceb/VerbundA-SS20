package Zeilinger_Lukas_Aufgabe_6;

import java.util.Scanner;

public class Doppelt {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		int zwischenspeicher = 0;
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print("Geben Sie die "+(i+1)+". Zahl ein: ");
			array[i] = scan.nextInt();
		}
		
		for(int i = 0; i < array.length; i++)
		{
			zwischenspeicher = -1;
			for (int j = 0; j < array.length; j++)
			{
				if (j != i && array[i] == array[j] && array[i] != -1)
				{
					array[j] = -1;
					zwischenspeicher = array[i];
				}
			}
			if (zwischenspeicher != -1)
			{
				System.out.println("Die Zahl "+ array[i] +" kommt doppelt oder öfters vor");
			}
			
		}

	}

}

package aufgabe04;

import java.util.Scanner;

public class Regenschirm 
{

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		boolean regen;
		
		System.out.print("Sieht es drauﬂen nach Regen aus (true/false)? ");
		regen = s.nextBoolean();
		
		if (regen)
		{
			System.out.println("Den Regenschirm nicht vergessen!");
		}
		
		System.out.println("Auf Wiedersehen!");
		s.close();
	}

}

package aufgabe04;

import java.util.Scanner;

public class Note {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int note;
		String notenText;
		
		System.out.print("Bitte die Note eingeben: ");
		note = s.nextInt();
		
		notenText = notenText(note);
		if (notenText != null)
		{
			System.out.println("Das ist ein: " + notenText(note));
		}
		
		s.close();
	}
	
	public static String notenText(int note)
	{
		String notenText = null;
		
		switch(note)
		{
			case 1 : notenText = "Sehr Gut";
					break;
			case 2 : notenText = "Gut";
					break;
			case 3 : notenText = "Befriedigend";
					break;
			case 4 : notenText = "Genügend";
					break;
			case 5 : notenText = "Nicht Genügend";
					break;
			default : System.err.println(note + " ist keine gültige Note.");
		}
		return notenText;
	}

}

package einheit1;

import java.util.Scanner;

public class Einkaufen 
{

	public static void main(String[] args) 
	{

		Scanner scan = new Scanner (System.in);

		
		String einkaufszettel = "";
		
		System.out.println("Erstes Produkt: ");
		String produkt1 = scan.nextLine();
		
		System.out.println("Erstes Produkt: ");
		String produkt2 = scan.nextLine();
		
		System.out.println("Erstes Produkt: ");
		String produkt3 = scan.nextLine();
		
		einkaufszettel = produkt1 +  " , "  + produkt2 + " , " + produkt3;
		
		System.out.println(einkaufszettel);
		
		
		
		
		
		
		
	}

}

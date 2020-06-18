package einheit1;
import java.util.Scanner;

public class Einkaufen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		String einkaufszettel = "";
		
		System.out.println("Erstes Produkt: ");
		einkaufszettel += scan.nextLine() + " , ";
		
		
		System.out.println("Zweites Produkt: ");
		einkaufszettel += scan.nextLine() + " , ";
		
		System.out.println("Drittes Produkt: ");
		einkaufszettel += scan.nextLine() + " , ";
		
				
		System.out.println( einkaufszettel );
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		

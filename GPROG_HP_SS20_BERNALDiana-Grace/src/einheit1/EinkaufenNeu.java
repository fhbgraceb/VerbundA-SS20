package einheit1;
import java.util.Scanner;

public class EinkaufenNeu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		String einkaufszettel = "";
		
		System.out.println("Erstes Produkt: ");
		String produkt1 = scan.nextLine();
		
		System.out.println("Zweites Produkt: ");
		String produkt2 = scan.nextLine();
		
		System.out.println("Drittes Produkt: ");
		String produkt3 = scan.nextLine();
		
		einkaufszettel = produkt1+produkt2+produkt3;
				
		System.out.println( einkaufszettel );
		
		
	}
	
}
		
		
		
		
		
		
		
		
		
		
		
		

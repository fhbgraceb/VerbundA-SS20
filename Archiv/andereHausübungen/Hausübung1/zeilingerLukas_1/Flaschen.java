package zeilingerLukas_1;
import java.util.Scanner; 

public class Flaschen 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Geben Sie die Anzahl an Flaschen ein!:");
		String az = scanner.next();
		System.out.println("Geben Sie das Fassungsvermögen der Flaschen in L ein!:");
		String fv = scanner.next();
		int anzahl = Integer.parseInt(az);
		double fassung = Double.parseDouble(fv);
		
		System.out.println("Gesamtfassungsvermögen: " + (anzahl * fassung) + " Liter");

	}

}

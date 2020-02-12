package zeilingerLukas_1;

import java.util.Scanner;
public class Schottersaecke 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Geben Sie das Leergewicht des LKWs an (kg): ");
		double leergewicht = Double.parseDouble(scanner.next());
		System.out.println("Geben Sie das Gesamtgewicht des LKWs an (kg): ");
		double gesamtgewicht = Double.parseDouble(scanner.next());
		
		int Säcke = 50;
		double RohgewichtSäcke = gesamtgewicht - leergewicht;
		int azSäcke = (int)(RohgewichtSäcke/50);
		
		System.out.println("Auf dem LKW sind " + azSäcke + " Säcke");
	}

}

package einheit1;

import java.util.Scanner;

public class ScannermitInteger {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Geben Sie einen Text Ihrer Wahl ein: ");
		String s = scanner.next();

		System.out.println("\nEingegeben wurde: \n\n"+s);

		
		scanner.close();

	}

}
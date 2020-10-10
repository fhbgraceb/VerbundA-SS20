<<<<<<< HEAD
package ifs_switch;

import java.util.Scanner;


public class IF_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte einen Testwert eingeben!");
		x = s.nextInt();
		
		if(x <= 0 || x >=100)
			System.out.println("Der Testwert muss zwischen 0 und 100 liegen");
		else if (x <= 25)
			System.out.println("Der Testwert liegt im unteren Bereich");
		else if (x >= 75)
			System.out.println("Der Testwert liegt im oberen Bereich");
		else
			System.out.println("Der Testwert liegt im mittleren Bereich");
		
	}

}
=======
package ifs_switch;

import java.util.Scanner;


public class IF_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Bitte einen Testwert eingeben!");
		x = s.nextInt();
		
		if(x <= 0 || x >=100)
			System.out.println("Der Testwert muss zwischen 0 und 100 liegen");
		else if (x <= 25)
			System.out.println("Der Testwert liegt im unteren Bereich");
		else if (x >= 75)
			System.out.println("Der Testwert liegt im oberen Bereich");
		else
			System.out.println("Der Testwert liegt im mittleren Bereich");
		
	}

}
>>>>>>> master

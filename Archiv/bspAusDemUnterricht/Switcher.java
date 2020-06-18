package bspAusDemUnterricht;

public class Switcher {

	public static void main(String[] args) {

		int note = 1;

		switch (note) {
		// auch möglich wären String/Character 
		case 1:
			System.out.println("Ausgezeichnet");
			break;
		case 2:
			System.out.println("Gut");
			break;
		case 3:
			System.out.println("Befriedgend");
			break;
		case 4:
			System.out.println("Genügend");
			break;
		case 5:
			System.out.println("Nicht Genügend");
			break;
		default: System.out.println("Zahl ist nicht bekannt");
		
		
		System.out.println();

		}

	}

}

package zweiteEinheit.switchCase;

public class Monatsbestimmung {

	public static void main(String[] args) {
		int monat=12;
		
		switch (monat) {
		case 1: System.out.println("J�nner"); break;
		case 2: System.out.println("Februar"); break;
		case 3: System.out.println("M�rz"); break;
		case 4: System.out.println("April"); break;
		
		default: System.out.println("Kenne ich nicht"); break;
		}

	}

}
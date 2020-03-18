package hausuebung3;

public class aGleichungen {
	/*
	Aufgabe 1) Gleichungen
	Schreiben Sie einen Anwendung namens „Gleichungen“, der für folgendes Gleichungssystem alle möglichen Lösungen berechnet.
	3x + 7y - 4z = -37
	x - y + 2z = 11
	2x - 5y + 6z = 40
	Die Lösungen sind ganzzahlig und für x, y und z gilt:
	-10 <= x <= 10
	-10 <= y <= 10
	-10 <= z <= 10
	Geben Sie alle möglichen Werte für x, y und z aus.
	*/
	
	public static void main(String[] args) {
		for (int x = -10; x <= 10; x++) {
			for (int y = -10; y <= 10; y++) {
				for (int z = -10; z <= 10; z++) {
					if (3*x + 7*y - 4*z == -37 && x - y + 2*z == 11 && 2*x - 5*y + 6*z == 40) {
						System.out.println("x: " + x + "\t y: " + y + "\t z:" + z);
					}
				}
			}
		}
	}
}

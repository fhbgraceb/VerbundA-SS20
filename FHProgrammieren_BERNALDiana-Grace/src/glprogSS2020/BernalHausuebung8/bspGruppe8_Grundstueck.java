package BernalHausuebung8;

public class bspGruppe8_Grundstueck {
	/*
	 * Grundst�ck: Die L�nge und die Breite (in Meter gemessen) eines Grundst�cks unterscheiden sich um 1. 
	 * Vergr��ert man die (kleinere) Breite des Grundst�cks um 3 und die L�nge um 7, 
	 * so nimmt die Fl�che um 84 m2 zu.
		Wie lang und breit ist das Grundst�ck nach dieser Vergr��erung?
	 * */

	public static void main(String[] args) {
		for (int laenge = 0; laenge < 100; laenge++) {
			for (int breite = 0; breite < 100; breite++) {
				int flaeche=breite*laenge;
				if (( (laenge+7)*(breite+3)==flaeche+84) && ( breite==laenge+1||laenge==breite+1 ) ) {
					System.out.printf("%d ist die L�nge, %d ist die Breite.", laenge, breite);
				}

			}
		}
	}

}

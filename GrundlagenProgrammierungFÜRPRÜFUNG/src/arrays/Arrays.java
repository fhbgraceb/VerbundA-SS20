package arrays;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Deklaration
				//Deklaration mit 2 Befehlen
				int[] a;
				a = new int[3];		//Datenfeld mit 3 Elementen (a[0],a[1],a[2])
				//oder mit einem Befehl
				int [] b = new int[3];
				
				//Zweidimensionales Array mit 4 Zeilen und 3 Spalten
				int[][] c = new int[4][3];

				System.out.println("Anzahl der Zeilen des Arrays c: " + c.length);
				System.out.println("Anzahl der Spalten des Arrays c (in Zeile 0): " + c[0].length);
				System.out.println("Anzahl der Spalten des Arrays c (in Zeile 4): " + c[4].length);

		//Initialisierung
				a[0] = 1;
				a[1] = 2;
				a[2] = 3;
				
				c[0][0] = 1;
				c[0][1] = 2;
				c[1][1] = 3;
				
		//Deklaration und Initialisierung
				//Anzahl der Elemente und Dimensionsgröße des Feldes 
				//ergibt sich automatisch durch die Anzahl der Werte
				double d[] = {1.1,2.2,3.3};
				int[] e = {4,5,6};
				int[] f = new int[3];
				int[] g = new int[] {1,2,3};	//int[] i = new int[3] {1,2,3}; ergibt einen Fehler

		//Länge eines Arrays => Anzahl der Elemente
				String[] jahreszeiten = new String[] {"Frühling", "Sommer", "Herbst", "Winter"};
				System.out.println("Array der Dimension " + jahreszeiten.length);
				//erster Index = 0, letzter = Länge - 1
				

		//Initialisierung mittels Schleife
				
				//while
				int zaehler= 0;
				int i[] = new int[3];
				while (zaehler < i.length) {
					i[zaehler] = zaehler * 2;
					System.out.println("i[" + zaehler + "] = " + i[zaehler]);
					zaehler++;
				}
				
				//for
				for(int h = 0;h < 3; h++) {		//oder: for(int c = 0;c < i.length; c++) {
					i[h] = h * 3;
					System.out.println("i[" + h + "] = " + i[h]);
				}

				
				//for each
				int j[] = new int[] {1,2,3};
				for  (int element : j) {		//Für jedes Element in dem Array i.
					element = element * 2;
					System.out.println(element);
					j[0] =  2;
				}
				System.out.println(j[0]);
				//System.out.println(element); => ergibt Fehler, da element nur in der Schleife gültig ist

				
		//Zweidimensionales Array mit 2 Zeilen und 3 Spalten
				int [][] mat = new int [][] {{1,2,3}, {4,5,6}};
				
				String[][] mehr = new String[2][3];
				
				System.out.println(mehr.length);

				//mit for-Scheife
				for(int k = 0;k < mehr.length; k++) {
					for(int l = 0;l < mehr[k].length; l++) {
						mehr[k][l] = k + "/" + l;
						System.out.println(mehr[k][l]);
					}
				}

//			mit for each Schleife
				int [][]A2 = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
				for (int [] feld: A2)
					for (int z :feld)
						System.out.println(z);
				
							
		//String, der durch Delimiter geteilt ist, in Einzelstrings zerlegen
				String s="Karli-Gerda-Fredi";
				String temp[];
				temp=s.split("-");
				System.out.println("Name1: " + temp[0] + ", Name2: " +temp[1] + ", Name3: " +temp[2] );
				
				
		// Array kopieren
				
				//Variante 1-CLONE
					//macht exakt eine 1:1 Kopie eines vorhandenen Arrays
					int[]q = new int[] {1,2,3,4};
					int[]r = q.clone();
					for (int zz:r)
						System.out.println(zz);
				
				//Variante 2 -ARRAYCOPY
					//ermöglicht es in die Kopie nur bestimmte Elemente zu übernehmen
					//im Array t stehen lediglich die Elemente 2 und 3
					int[]x = new int[] {1,2,3,4};
					int[]t  = new int[2];
					System.arraycopy(x, 1, t, 0, 2);
		//System.arraycopy("Ursprungsarray", "von welcher Position", "Zielarray", "beginnend bei welcher Position", "Länge => d. h. wie viele Elemente")
					for (int zz:t)
						System.out.println(zz);
					
				//Variante 3 -FOR Schleife 
					int[]u = new int[] {1,2,3,4};
					int[]v = new int[4];
					for (int w = 0;w<u.length;w++) {
							v[w]=u[w];
							System.out.println(u[w]);
					}


				// Array's kopieren (und hier im Beispiel vergrößern)
				int []feld = new int[2];
				feld[0] = 1;
				feld[1] = 2;
				//feld[2] = 3; ergibt Fehler ArrayIndexOutOfBoundsExeption
				int []temp1 = new int[3];
				
				System.arraycopy(feld, 0, temp1, 0, feld.length);
				feld = temp1;
				feld[2] = 3;
				for (int zz:feld)
					System.out.println(zz);
					

			

	}

}

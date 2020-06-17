package schleifen;

public class For_Each_Schleife {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// For each Schleifen eignen sich um Collections (gespeicherte Objekte
		// strukturiert in einer geordneten Art und Weise) ohne Zähler 
		// zu durchlaufen, häufig werden sie bei array's angewandt.
		// Wenn in der Schleife mehr als eine Anweisung erfolgt, muss
		// das {} gesetzt werden!

		int []arr = new int []{4,2,9,5,1,2,7,3,8,6};
		
		for (int zahl : arr)
			System.out.println(zahl);
		
		// oder mit einer normalen FOR Schleife
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
		
		// bei mehrdimensionalen Arrays 
	
			// 2 dim. Feld Array mit for each Schleife
			int [][]A2 = new int [][] {{1,2,3},{4,5,6},{7,8,9}};
			for (int [] feld: A2)
				for (int z :feld)
					System.out.println(z);
		
			// 2 dim. Feld Array mit for Schleife
			for (int i=0;i<A2.length;i++)
				for (int j=0;j<A2[i].length;j++)
					System.out.println("A(" + (i+1) + "," + (j+1) + ")=" + A2[i][j]);


			// 3 dim. Feld Array mit for each Schleife
			int [][][]A3 = new int [][][] {{{1,2,3},{4,5,6},{7,8,9},{10,11,12}}};
			for (int [][] feld1: A3)
				for (int []feld2 :feld1)
					for (int z:feld2)
						System.out.println(z);
		
			// 3 dim. Feld Array mit for Schleife
			for (int i=0;i<A3.length;i++)
				for (int j=0;j<A3[i].length;j++)
					for (int k = 0; k < A3[i][j].length; k++) 
						System.out.println("A(" + (i+1) + "," + (j+1) + "," + (k+1) + ")=" + A3[i][j][k]);

				
		

			
	}

}

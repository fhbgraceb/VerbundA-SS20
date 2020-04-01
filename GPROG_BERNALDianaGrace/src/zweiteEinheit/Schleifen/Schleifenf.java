package zweiteEinheit.Schleifen;

public class Schleifenf {

	public static void main(String[] args) {
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("Durchlauf:\t" + i);
			sum = sum +i;
		}
		
		System.out.println("Die Summe lautet: " + sum);
	}

}

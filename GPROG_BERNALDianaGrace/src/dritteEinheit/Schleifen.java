package dritteEinheit;

public class Schleifen {

	public static void main(String[] args) {
		int count=0;
		
		for (int i = 1; i <= 100; i++) {
			if (i%2==0) {
				System.out.println(i + "ist eine gerade Zahl");
				count++;
			}else {
				System.out.println(i + "ist eine ungerade Zahl");
			}
			
		}
		System.out.println("Es gab soviele gerade Zahlen: " + count);
	}

}

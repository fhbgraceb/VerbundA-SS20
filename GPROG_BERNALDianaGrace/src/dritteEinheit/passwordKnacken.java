package dritteEinheit;

public class passwordKnacken {

	public static void main(String[] args) {
//		int zahl = 65;
//		System.out.println((char)zahl);
//		
//		char z='Z';
//		System.out.println((int) z);
		
		int count = 0;
		
		String korrektesPWDString ="ABCD";
		
		for (char zeichen1 = 'A'; zeichen1 <= 'Z'; zeichen1++) {
			for (char zeichen2 = 'A'; zeichen2 <= 'Z'; zeichen2++) {
				for (char zeichen3 = 'A'; zeichen3 <= 'Z'; zeichen3++) {
					for (char zeichen4 = 'A'; zeichen4 <= 'Z'; zeichen4++) {
						String versuch = ""+zeichen1+zeichen2+zeichen3+zeichen4;
						count++;
						if (versuch.equals(korrektesPWDString)) {
							System.out.println(versuch + " - gefunden an der Position: " + count);
							break;
						}
					}
				}
			}
		}
		

	}

}
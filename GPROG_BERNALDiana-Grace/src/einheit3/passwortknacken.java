package einheit3;

public class passwortknacken {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int zahl = 65;
//		System.out.println((char)zahl);
//		
//		char z = 'Z';
//		System.out.println((int) z);
		
		String korrektesPWD = "ABCD";
		
		int count = 0;
		
		for (char zeichen = 'A'; zeichen <= 'Z'; zeichen++) {
			for (char zeichen1 = 'A'; zeichen1 <= 'Z'; zeichen1++) {
				for (char zeichen2 = 'A'; zeichen2 <= 'Z'; zeichen2++) {
					for (char zeichen3 = 'A'; zeichen3 <= 'Z'; zeichen3++) {
						
						
						String versuch = ""+zeichen+zeichen1+zeichen2+zeichen3;
						count++;
						if(versuch.equals(korrektesPWD)) {
							System.out.println(versuch + " Gefunden an der Postition: " + count);
							break;
							
						}
						
			}
			
		}
			
		}
		
		
	}
	}
}



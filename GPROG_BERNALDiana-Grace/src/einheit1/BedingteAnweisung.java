package einheit1;

public class BedingteAnweisung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String name = "Deutsch";
		String geschlecht = "M";
		
		
		if (geschlecht.equalsIgnoreCase("m")) {
			System.out.println("Sehr geehrter Herr " + name);
		
		}else {
			System.out.println("Sehr geehrte Frau " + name);
			
			
		}
		
	}

}

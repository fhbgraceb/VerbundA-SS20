package einheit4;

public class StringVergleichen {

	public static void main(String[] args) {


		String a = "Text";
		String b = "text";
		
		if(a.equalsIgnoreCase(b)) {
			System.out.println("Gleich");
		}else {
			System.out.println("Ungleich");
		}
		


	}

}

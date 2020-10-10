package bspAusDemUnterricht;
import java.util.Scanner;

public class WahrUndFalsch {
	
	
public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
	
	String meineUserdaten = "mide";
	String meinPwd = "Montag";
	
	
	
	System.out.println("Geben Sie Ihren Benutzernamen ein: ");
	String userBenutzereingabe = scan.nextLine();
	
	System.out.println("Geben Sie Ihr Passwort ein: ");
	String userPasswortEingabe = scan.nextLine();
	scan.close();

	// hier gilt es equalsIgnorCase zu vermeiden, weswegen?
	boolean ergebnis = (meineUserdaten.equals(userBenutzereingabe)) 
			&& (meinPwd.equals(userPasswortEingabe));
	
	
	System.out.println("Ergebnis: " + ergebnis);
	
	
		
	
	
}
	
	


}

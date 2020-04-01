package dritteEinheit;

import java.awt.HeadlessException;

import javax.swing.JOptionPane;

public class Intro {

	public static void main(String[] args) {
		//TEXTBOX machen mit vorgefertiges Fenster
		String zahl1=JOptionPane.showInputDialog("Geben Sie mir die 1. Zahl");
		String zahl2=JOptionPane.showInputDialog("Geben Sie mir die 2. Zahl");
		
		try {
			//Parse STRING to INT
			int z1 = Integer.valueOf(zahl1);
			int z2 = Integer.valueOf(zahl2);
			
			int ergebnis = z1 + z2;
			
			JOptionPane.showMessageDialog(null, "Das Ergebnis lautet: " + ergebnis);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Ist keine zahl");
			e.printStackTrace();
		} catch (HeadlessException e) {
			e.printStackTrace();
		}
	}

}

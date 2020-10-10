package goopWS2020.bernalHausuebung1.beispiel1Angestellte;

/*
 * Beispiel 1 – Angestellte	
Angestellte haben eine unveränderliche SVNr, Vor- und Zuname und verdienen einen bestimmten Gehalt. 
Bei neuen Angestellten ist der Gehalt immer 1500€.
Schreiben Sie Methoden um Angestellten eine Gehaltserhöhung zu geben und ihren Nachnamen zu ändern.

 * */

public class Angestellter {
	private static final double grundgehalt = 1500;
	
	private final String sVNr;
	private String vorname;
	private String zuname;
	private double gehalt;
	
	public Angestellter(String sVNr, String vorname, String zuname) {
		this.sVNr = sVNr;
		this.setVorname(vorname);
		this.setNachname(zuname);
		this.setGehalt(grundgehalt);
	}

	private void setVorname(String vorname) {
		if ((vorname == null) || (vorname.trim().length() == 0)) {
			throw new IllegalArgumentException("Ungültiger Vorname!");
		}else {
			this.vorname = vorname.trim();
		}	
	}
	
	public void setNachname(String zuname) {
		if ((zuname == null) || (zuname.trim().length() == 0)) {
			throw new IllegalArgumentException("Ungültiger Nachname!");
		}else {
			this.zuname = zuname.trim();
		}
		
	}
	
	private void setGehalt(double gehalt) {
		if (! (gehalt > 0)) {
			throw new IllegalArgumentException("Das Gehalt muss positiv sein!");			
		}else {
			this.gehalt = gehalt;
		}
		
	}
	
	public void gehaltsErhoehung(double zusatz) {
		if (! (zusatz > 0)) {
			throw new IllegalArgumentException("Das Gehalt kann nur erhöht werden, sonst gibt es Probleme mit der Arbeiterkammer...");
		}else {
			this.setGehalt(this.gehalt + zusatz);
		}	
	}
	
	public void print() {
		System.out.println(this.zuname + ", " + this.vorname);
		System.out.println("\t SVNr: " + this.sVNr);
		System.out.println("\t Gehalt: " + this.gehalt + " €");
	}
	
	public String toString() {
		return "[" + this.sVNr + " " + this.vorname + " " + this.zuname + " " + this.gehalt + "]";
	}
}

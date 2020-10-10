package goopWS2020.bernalHausuebung1.beispiel3Fass;
/*
 * Beispiel 3 – Fass	
Fässer haben ein (fixes) maximales Fassungsvermögen und sind in einer Farbe gestrichen.
Schreiben Sie Methoden zum einfüllen und entnehmen von Flüssigkeit sowie zum umfärben eines Fasses, 
wobei nur leere Fässer umgefärbt werden dürfen.

 * */
public class Fass {
	private final double volumen;
	private double inhalt;
	private String farbe;
	
	public Fass(double volumen, String farbe) {
		if (! (volumen > 0)) {
			throw new IllegalArgumentException("Fässer müssen ein positives Volumen haben.");
		}
		this.volumen = volumen;
		this.setFarbe(farbe);
		this.setInhalt(0);
	}
		
	private void setInhalt(double inhalt) {
		if (! (inhalt >= 0)) {
			throw new IllegalArgumentException("Fässer können keinen negativen Inhalt haben.");
		}
		if (! (inhalt <= this.volumen)) {
			throw new IllegalArgumentException("Fässer können nicht mehr Inhalt als das Volumen (" + this.volumen + ") haben.");			
		}
		this.inhalt = inhalt;
	}
	
	private void setFarbe(String farbe) {
		if ((farbe == null) || (farbe.trim().isEmpty())) {
			throw new IllegalArgumentException("Fässer können keine leere Farbe haben...");
		}
		this.farbe = farbe.trim();
	}
	
	public void neuStreichen(String neueFarbe) {
		if (this.inhalt != 0) {
			throw new IllegalArgumentException("Ein volles Fass kann nicht gestrichen werden!");
		}
		this.setFarbe(neueFarbe);
	}
	
	public void einfuellen(double menge) {
		if (! (menge > 0))	{
			throw new IllegalArgumentException("Es können nur positive Mengen in ein Fass eingefüllt werden...");
		}
		this.setInhalt(this.inhalt + menge);
	}
	
	public void abfuellen(double menge) {
		if (! (menge > 0))	{
			throw new IllegalArgumentException("Es können nur positive Mengen aus einem Fass entnommen werden.");
		}
		if (menge > this.inhalt) {
			throw new IllegalArgumentException("Es kann nicht mehr entnommen werden als was drinnen ist, der derzeitiger Inhalt ist " + this.inhalt + " Liter.");
		}
		this.setInhalt(this.inhalt - menge);
	}
	
	public void print() {
		System.out.println("Du hast ein Fass mit einem max. Volumen von " + this.volumen + " Liter, mit der Farbe " + this.farbe);
		System.out.println("\t derzeitiger Inhalt sind " + this.inhalt + " Liter");
	}
	
	@Override
	public String toString() {
		return "[" + this.farbe + " (" + this.inhalt + "/" + this.volumen + ")]";
	}
}

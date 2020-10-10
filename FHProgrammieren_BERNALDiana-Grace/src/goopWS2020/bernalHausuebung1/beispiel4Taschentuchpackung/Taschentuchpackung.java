package goopWS2020.bernalHausuebung1.beispiel4Taschentuchpackung;
/*
 * Beispiel 4 – Taschentuchpackung	
Taschentücher werden als normale Packung (enthält 10 Stück) und als Großpackung  (100 Stück) verkauft.
Schreiben Sie eine Methode, mit der jeweils ein Taschentuch aus einer Packung entnommen wird (falls noch eines enthalten ist).

 * */
public class Taschentuchpackung {
	private static final int stueckNormal = 10;
	private static final int stueckGross = 100;
	private final boolean normalPackung;
	private int inhalt; 		
	
	public Taschentuchpackung(boolean normalPackung) {
		this.normalPackung = normalPackung;
		if (normalPackung) {
			this.inhalt = stueckNormal;
		} else {
			this.inhalt = stueckGross;
		}
	}
	
	public void entnehmen() {
		if (this.inhalt==0) {
			throw new IllegalArgumentException("Die Packung ist leer!");
		}
		this.inhalt--;
	}
	
	public void print() {
		if (this.normalPackung) {
			System.out.println("  Normal [max. " + stueckNormal + " Stück]");
		} else {
			System.out.println("  Groß [max. " + stueckGross + "  Stück]");
		}
		System.out.println("\t Tücher derzeit: " + this.inhalt);
	}
	
	@Override
	public String toString() {
		return "[" + this.inhalt + " (von " + (this.normalPackung ? stueckNormal : stueckGross) + ")]";
	}
}

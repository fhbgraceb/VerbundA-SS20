package goopWS2020.bernalHausuebung1.beispiel4Taschentuchpackung;
/*
 * Beispiel 4 � Taschentuchpackung	
Taschent�cher werden als normale Packung (enth�lt 10 St�ck) und als Gro�packung  (100 St�ck) verkauft.
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
			System.out.println("  Normal [max. " + stueckNormal + " St�ck]");
		} else {
			System.out.println("  Gro� [max. " + stueckGross + "  St�ck]");
		}
		System.out.println("\t T�cher derzeit: " + this.inhalt);
	}
	
	@Override
	public String toString() {
		return "[" + this.inhalt + " (von " + (this.normalPackung ? stueckNormal : stueckGross) + ")]";
	}
}

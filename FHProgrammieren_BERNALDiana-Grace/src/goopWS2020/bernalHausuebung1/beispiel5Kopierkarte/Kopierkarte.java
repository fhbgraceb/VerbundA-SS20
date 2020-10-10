package goopWS2020.bernalHausuebung1.beispiel5Kopierkarte;
/*
 * Beispiel 5 – Kopierkarte	
Neue Kopierkarten werden stets mit 500 Punkten verkauft.
Pro kopierter Seite werden 5 Punkte abgebucht. 
Will man die Seiten geheftet haben, so werden weitere 4 Punkte abgebucht.
Implementieren Sie eine Methode 
kopieren(int seiten, int anzahl, boolean geheftet)
mit der die entsprechenden Punkte von der Karte abgebucht werden.
seiten gibt die Anzahl der zu kopierenden Seiten an, 
anzahl wie oft jede Seite kopiert werden soll. 
Falls nicht mehr genug Punkte auf der Karte sind, so kann der Kopierauftrag nicht durchgeführt werden.
Implementieren Sie auch eine Methode, mit der auf der Karte 500 Punkte aufgebucht werden können.
* ... für saubere Lösungen, die leichte Änderungen der Punkte erlauben.
Erweiterung:	
Wird doppelseitig kopiert, so kostet dies 9 Punkte pro Doppelseite.
Adaptieren Sie die Methode kopieren entsprechend.

 * */
public class Kopierkarte {
	private static final int startpoints = 500;
	private static final int preisproSeite = 5;
	private static final int preisproHeftung = 4;
	private static final int preisproDoppelseite = 9;
	private int punkte;
	
	private void setPunkte(int punkte) {
		this.punkte = punkte;
	}
	
	public void aufbuchen() {
		this.setPunkte(punkte + startpoints);
	}
	
	
	public void kopieren(int seiten, int anzahl, boolean geheftet, boolean doppelt){
		int preis;

		if (doppelt) {
			preis = (seiten / 2) * anzahl * preisproDoppelseite;
			if (seiten % 2 != 0) {
				preis += anzahl * preisproSeite;
			}
		} else {
			preis = seiten * anzahl * preisproSeite;
		}
		if (geheftet) {
			preis += anzahl * preisproHeftung;
		}
		if (preis>this.punkte) {
			throw new IllegalArgumentException("Sie besitzen nicht genug Punkte. Sie sollten aufladen, dazu die Methode aufbuchen nutzen.");
		}else {
			this.setPunkte(this.punkte - preis);
		}
		
	}
	
	public void print() {
		System.out.println("Die Karte enthält " + this.punkte + " Punkte.");
		if (this.punkte==0) {
			throw new IllegalArgumentException("Sie sollten aufladen, dazu die Methode aufbuchen nutzen! ");
		}
	}
	
	@Override
	public String toString() {
		return "Kopierkarte [punkte=" + punkte + "]";
	}
}

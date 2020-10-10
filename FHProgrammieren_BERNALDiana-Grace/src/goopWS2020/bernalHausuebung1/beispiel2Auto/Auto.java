package goopWS2020.bernalHausuebung1.beispiel2Auto;

/*Beispiel 2 – Auto		
Autos haben eine unveränderliche Fahrgestellnummer, PS, Typ(SUV, Limousine, Kombi, ..) 
sowie eine momentane und eine Höchstgeschwindigkeit.
Schreiben Sie Methoden zum Beschleunigen, Abbremsen und Tunen (um einen bestimmten Prozentsatz) eines Autos.

 * */

public class Auto {

	private final String FNr;
	private Type type;
	private double ps; 					
	private double maxSpeed;	
	private double currentSpeed; 
	public Auto(String FNr, double ps, double maxSpeed, double currentSpeed, Type type) {
		if ((FNr == null) || ("".equals(FNr.trim()))) {
			throw new IllegalArgumentException("Autos ohne Fahrgestellnummer existieren nicht!");
		}
		this.FNr = FNr.trim();
		this.setPS(ps);	
		this.setMaxSpeed(maxSpeed);
		this.setCurrentSpeed(currentSpeed);
		this.type = type;
	}
	
	public void setPS(double ps) {
		if (! (ps > 0)) {
			throw new IllegalArgumentException("Ungültig! PS müssen größer als 0 sein!");
		}
		this.ps = ps;			
	}
	
	private void setMaxSpeed(double maxSpeed) {
		if (! (maxSpeed > 0)) {
			throw new IllegalArgumentException("Ungültig! Höchstgeschwindigkeit muss größer als 0 sein.");
		}
		this.maxSpeed = maxSpeed;
	}
	
	private void setCurrentSpeed (double currentSpeed) {
		
		if (! (currentSpeed <= this.maxSpeed)) {
			throw new IllegalArgumentException("Ein Auto kann nicht schneller als die Höchstgeschwindigkeit " + this.maxSpeed + " km/h fahren.");
		}
		this.currentSpeed = currentSpeed;
	}
	
	public double beschleunigen (double speed) {
		if (! (speed >= 0)) {
			throw new IllegalArgumentException("Keine negative Beschleunigung!");
		}
		this.setCurrentSpeed(this.currentSpeed + speed);
		return this.currentSpeed;
	}

	public double abbremsen (double speed) {
		if (! (speed >= 0)) {
			throw new IllegalArgumentException("0 abbremsung geht nicht");
		}
		this.setCurrentSpeed(this.currentSpeed - speed);
		return this.currentSpeed;
	}
	
	public void tunen (double prozent) {
		double zusatzPS;
		if (! (this.currentSpeed == 0)) {
			throw new IllegalArgumentException("Fahrende Autos können nicht getuned werden!");
		}
		zusatzPS = this.ps * (prozent / 100.0);
		this.setPS(this.ps + zusatzPS);
	}
	
	public void print() {
		System.out.println("Auto");
		System.out.println("\t Fahrgestellnummer: " + this.FNr);
		System.out.println("\t PS: " + this.ps);
		System.out.println("\t Höchstgeschwindigkeit: " + this.maxSpeed);
		System.out.println("\t momentane Geschwindigkeit: " + this.currentSpeed);
		System.out.println("\t Type: " + this.type);
	}
	
	public String toString() {
		return "Auto [FNr=" + FNr + ", type=" + type + ", ps=" + ps + ", maxSpeed=" + maxSpeed + ", currentSpeed="
				+ currentSpeed + "]";
	}

}

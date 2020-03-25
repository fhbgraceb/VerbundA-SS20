package einheit4;

public class WhileBsp {

	public static void main(String[] args) {

		// Ziel 10 Jahre, Kapitel 1000, Zinsatz 5%,
		// 0, 10 = Ergebnis

		// Wieviel Jahre muss ich sparen das ich von K0 = 1000, auf 10000 komme, wenn
		// ein Zinsatz vorherscht von 5%, ???? Jahre ????

		double aktuellesKapitel = 1000;

		double wunschkapital = 2000;

		int count = 0;

		while (aktuellesKapitel <= wunschkapital) { // true
			aktuellesKapitel = aktuellesKapitel + (aktuellesKapitel * 0.05);
			count++;
		}

		System.out.println("Sie haben benötigt " + count + " Jahre ");

	}

}

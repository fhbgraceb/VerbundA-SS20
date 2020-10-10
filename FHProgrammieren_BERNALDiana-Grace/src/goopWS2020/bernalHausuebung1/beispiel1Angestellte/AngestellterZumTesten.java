package goopWS2020.bernalHausuebung1.beispiel1Angestellte;

public class AngestellterZumTesten {

	public static void main(String[] args) {
		Angestellter angestellter1, angestellter2, angestellter3, angestellter4;

		angestellter1 = new Angestellter("4897 250665", "Aryuna", "Dorzhieva");
		angestellter2 = new Angestellter("8168 180962", "Alex", "Dunkler");
		angestellter3 = new Angestellter("1823 120568", "Daniel", "Geist");
		angestellter4 = new Angestellter("1823 120568", "Meow", "Meow");
		
		angestellter1.print();
		angestellter2.print();
		angestellter3.print();
		
		System.out.println("--- Änderungen ---");
		angestellter1.gehaltsErhoehung(1000);
		angestellter3.setNachname("Gleicher");
		angestellter4.setNachname("Barhoumi");
		angestellter4.gehaltsErhoehung(-100);;
		
		
		angestellter1.print();
		angestellter2.print();
		angestellter3.print();
		
	}

}

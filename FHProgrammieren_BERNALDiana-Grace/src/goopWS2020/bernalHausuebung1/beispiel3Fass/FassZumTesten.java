package goopWS2020.bernalHausuebung1.beispiel3Fass;

public class FassZumTesten {

	public static void main(String[] args) {
		Fass fassvonGrace = new Fass(350, "ROT");
	
		fassvonGrace.print();
		fassvonGrace.neuStreichen("ROT");
		fassvonGrace.print();
		fassvonGrace.einfuellen(20);
		fassvonGrace.print();
		fassvonGrace.abfuellen(20);
		fassvonGrace.print();
		fassvonGrace.neuStreichen("BLAU");
		fassvonGrace.print();
		fassvonGrace.abfuellen(-50);;
		fassvonGrace.print();

	}
}

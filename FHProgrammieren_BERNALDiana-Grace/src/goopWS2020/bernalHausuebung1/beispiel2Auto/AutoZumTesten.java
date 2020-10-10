package goopWS2020.bernalHausuebung1.beispiel2Auto;

public class AutoZumTesten {

	public static void main(String[] args) {
		Auto autovonGraceAuto = new Auto("15341356415424154", 150, 230, 50, Type.SUV);
		
		autovonGraceAuto.print();
		autovonGraceAuto.abbremsen(50);
		autovonGraceAuto.print();
		autovonGraceAuto.tunen(25);
		autovonGraceAuto.print();
	}

}

package goopWS2020.bernalHausuebung1.beispiel5Kopierkarte;

public class KopierkartenTest {

	public static void main(String[] args) {
		Kopierkarte copycardvongrace = new Kopierkarte();
		
		copycardvongrace.print();
		copycardvongrace.aufbuchen();
		copycardvongrace.print();
		copycardvongrace.kopieren(20, 1, true, true); // (((20*1)/2)*9)+4=94
		copycardvongrace.print();
		copycardvongrace.kopieren(8, 4, true, true); // 160
		copycardvongrace.print();
		copycardvongrace.kopieren(150000, 4, true, true); // sollte sich nicht ausgehen
		copycardvongrace.print();
	}

}

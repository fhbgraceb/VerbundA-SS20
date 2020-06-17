package ifs_switch;

public class bedingter_dreistelliger_Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Aufbau: (Prüfung) & WAHR-Part : FALSE-Part
		int i = 4;
		String s = (i % 2 == 0) ? "gerade" : "ungerade";
		System.out.println(s);
	}

}

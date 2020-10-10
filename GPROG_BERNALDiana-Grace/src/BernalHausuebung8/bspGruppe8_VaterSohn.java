package BernalHausuebung8;

public class bspGruppe8_VaterSohn {

	/*
	 * VaterSohn: Vor 5 Jahren war der Vater 5-mal so alt wie der Sohn. In drei
	 * Jahren wird er 3-mal so alt sein wie der Sohn. Wie alt sind Vater und Sohn
	 * heute?
	 */

	public static void main(String[] args) {
		for (int vater = 12; vater <= 100; vater++) {
			for (int sohn = 5; sohn < vater; sohn++) {
				if (((vater - 5) == 5 * (sohn - 5)) && ((vater + 3) == 3 * (sohn + 3))) {
					System.out.printf("Vater ist heute %d und der Sohn %d Jahre alt.", vater, sohn);
				}
			}
		}

	}

}

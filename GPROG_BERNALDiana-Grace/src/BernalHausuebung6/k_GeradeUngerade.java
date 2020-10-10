package BernalHausuebung6;

import java.util.ArrayList;
import java.util.Scanner;

public class k_GeradeUngerade {

	/*
	 * Lesen Sie beliebig viele (maximal 50) Zahlen ein (Abschluss mit 0) und
	 * speichern Sie diese in einem Array. Danach teilen Sie die Zahlen auf zwei
	 * weitere Arrays auf, wobei die geraden Zahlen in das eine Array und die
	 * ungeraden Zahlen in das andere Array kommen sollen. Geben Sie dann zuerst die
	 * geraden, danach die ungeraden Zahlen aus.
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int zahl = 0;		
		ArrayList<Integer> zahlenArray = new ArrayList<>();
		ArrayList<Integer> geradeArray = new ArrayList<>();
		ArrayList<Integer> ungeradeArray = new ArrayList<>();
		boolean eingabeFertig= false;

		System.out.println("Bitte geben Sie Zahlen nacheinander ein, nach jeder Zahl bitte enter eingeben (max. 50 und Abschluss mit 0): ");
		while (!eingabeFertig) {
			zahl = s.nextInt();
			if ((zahl==0) || ((zahlenArray.size()) > 50)) {
				eingabeFertig=true;
			}
			else {
				zahlenArray.add(zahl);
				if (zahl%2==0) {
					geradeArray.add(zahl);
				}else {
					ungeradeArray.add(zahl);
				}
			}
		}
		System.out.println("Gerade Zahlen: ");
			for (int i = 0; i < geradeArray.size(); i++) {
				System.out.println(geradeArray.get(i));
			}
		System.out.println("\nUngerade Zahlen: ");
			for (int j = 0; j < ungeradeArray.size(); j++) {
				System.out.println(ungeradeArray.get(j));
			}
		s.close();
	}

}

package BernalHausuebung7;

import BernalHausuebung6.k_GeradeUngerade;

public class c_dieGunstdesKoenigs {
	/*
	 * Ein König wird 50 und will eine nette Geste zeigen. Der König, auch ein genialer Mathematiker, 
	 * teilt seinem Gefängniswächter folgendes mit. Wir haben 100 Zellen, die von 1 bis 100 nummeriert sind 
	 * und auch genau 100 Gefangene, jeder in einer Zelle. Alle Zelltüren sind natürlich geschlossen. 
	 * Geh nun 100 Mal alle Zellen ab und drehe beim ersten Mal den Schlüssel in jedem Schloss einmal um, 
	 * beim zweiten Mal bei jedem 2. Schloss (2, 4, 6,…), beim 3. Mal bei jedem 3. Schloss (3, 6, 9, …) und so fort. 
	 * Mit jeder Drehung des Schlüssels wird das Schloss geöffnet beziehungsweise wieder geschlossen. 
	 * Nun sag mir Wächter, welche Zellen werden am Ende offen sein und wie viele Gefangene werden frei kommen?
		Schreiben Sie ein Programm welche gewünschte Frage nach getaner Tätigkeit beantwortet.
	 * */

	public static void main(String[] args) {
		int [] zellen = new int[100];
		int offene = 0;
		for (int i = 0; i < zellen.length-1; i++) {
			zellen[i]=0;
		}
		for (int j = 0; j < zellen.length-1; j++) {
			int k = j;
			while (k < zellen.length) {
				if (zellen[k]==0) {
					zellen[k]=1;
				}else {
					zellen[k]=0;
				}
				k++;
				
			}
		}
		for (int l = 0; l < zellen.length-1; l++) {
			if (zellen[l]==1) {
				offene++;
				System.out.println("Zelle " + l + " ist offen!");
			}
		}
		System.out.println("Es gibt insgesamt " + offene + " Zellen!");

	}

}

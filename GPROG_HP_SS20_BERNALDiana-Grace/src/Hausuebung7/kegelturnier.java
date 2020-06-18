package Hausuebung7;

public class kegelturnier {

	public static void main(String[] args) {
		int wuerfe = 13;
		int[][] spieler = new int[47][wuerfe];
		int[] summen = new int[wuerfe];
		for (int i = 0; i < wuerfe; i++) {
			for (int j = 0; j < wuerfe; j++) {
				spieler[i][j] = Random(0, 9);
				summen[i] = summen[i] + spieler[i][j];
			}
		}
		int max = 0;
		int gewinner = 0;
		for (int k = 0; k < wuerfe; k++) {
			if (summen[k] > max) {
				max = summen[k];
				gewinner = k + 101;
			}
		}
		System.out.println("Startnummer " + gewinner + " hat gewonnen - " + max + " Punkten!");
	}

	private static int Random(int min, int max) {
		int range = (max - min) + 1;
		return (int) (Math.random() * range) + min;
	}

}

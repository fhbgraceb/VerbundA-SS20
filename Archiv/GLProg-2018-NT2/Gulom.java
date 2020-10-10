package _glProg_2018_nt2_WORK;

public class Gulom 
{

	/*
	* Die erste Gulom -Zahl ist 1.
Die zweite Gulom-Zahl ist 3.
Alle weiteren Gulom-Zahlen berechnen sich wie folgt:
Die n. Gulom-Zahl ist die (n-1). Gulom-Zahl minus der (n-2). Gulom-Zahl.
Die 3. Gulom- Zahl ist also die 2. Gulom-Zahl (3) minus der 1. Gulom-Zahl (1) also 3 – 1 = 2.
Die 4. Gulom- Zahl ist die 3. Gulom-Zahl (2) minus der 2. Gulom-Zahl (3) also 2 – 3 = -1.
Die ersten 6 Gulom-Zahlen sind also:
1, 3, 2, -1, -3, -2, …
Berechnen Sie die 50. Gulom-Zahl und geben sie diese aus.

	* */

	public static void main(String[] args) 
	{
		final int anzahl = 50;
		float[] gulom = new float[anzahl + 1];
		
		gulom[1] = 1;
		gulom[2] = 3;
		for (int i = 3; i <= anzahl; i++)
		{
			gulom[i] = gulom[i - 1] - gulom[i - 2];
			System.out.println(gulom[i]);
		}
		
		System.out.println(gulom[anzahl]);
	}

}

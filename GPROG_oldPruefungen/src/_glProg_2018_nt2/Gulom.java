package _glProg_2018_nt2;

public class Gulom 
{

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

package _glProg_2016_NT2_GrA;

public class Reihe 
{

	/*
	Beim wievielten Glied ist die (Summe der) folgenden Reihe zum ersten Mal kleiner als -3?
 - 1/2 - 2/3 - 3/5 + 4/8 + 5/12 - 6/17 - 7/23 - 8/30 + 9/38 + 10/47 - 11/57 - 12/68 - 13/80 +   ….
	* */

	public static void main(String[] args) 
	{
		final double grenze = -3.0;
		double summe;
		double glied;
		int zaehler;
		int nenner;

		summe = 0;
		zaehler = 1;
		nenner = 2;
		do
		{
			glied = ((double)zaehler) / nenner;
			
			if ((zaehler % 5 == 1) || (zaehler % 5 == 2) || (zaehler % 5 == 3))
			{
				summe -= glied;
			}
			else
			{
				summe += glied;
			}
			System.out.println(zaehler + " / " + nenner + " = " + glied + " - " + summe);
			if (summe >= grenze)
			{
				nenner += zaehler;
				zaehler++;
			}
		} while (summe >= grenze);
		System.out.println("Bei Glied Nr. " + zaehler + " ist die Summe zum ersten Mal kleiner als " + grenze + ".");
	}
	
}

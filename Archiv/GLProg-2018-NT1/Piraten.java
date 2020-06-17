package _glProg_2018_nt1_WORK;

public class Piraten 
{

	/*
	* Die Piraten kommen von einer Kaperfahrt zurück und prahlen alle damit, wie erfolgreich sie gewesen sind.
Rotbart, der Räudige hat mehr als doppelt so viele Dublonen erbeutet wie der einäugige Sven.
* Dieser hat um mindestens 4 Dublonen mehr erkämpft als Harkan mit dem Holzbein.
Jeder von ihnen hat aber mehr als 25 Dublonen mitgebracht.
Erstellen Sie ein Programm, das alle Möglichkeiten ausgibt,
* wie viele Dublonen jeder der 3 erobert haben kann, wenn auch noch bekannt ist,
* dass die drei insgesamt weniger als 200 Dublonen mitgebracht haben.

	* */

	public static void main(String[] args) 
	{
		final int maxSumme = 200;
		
		for (int rotbart = 26; rotbart < maxSumme; rotbart++)
		{
			for (int sven = 26; sven < maxSumme; sven++)
			{
				for (int harkan = 26; harkan < maxSumme; harkan++)
				{
					if ((rotbart + sven + harkan < maxSumme) && (rotbart > sven * 2) && (sven >= harkan + 4))
					{
						System.out.printf("Rotbart: %3d, Sven: %3d, Harkan: %3d\n", rotbart, sven, harkan);
					}
				}
			}
		}
	}

}

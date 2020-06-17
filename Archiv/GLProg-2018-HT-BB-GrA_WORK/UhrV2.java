package _glProg_2018_BB_HT_WORK;

public class UhrV2 
{

	/*
	* Erstellen Sie ein Programm das eine Uhr simuliert, d.h. das alle Uhrzeiten eines Tages der Reihe nach ausgibt:
00:00:00
00:00:01
…
11:59:58
11:59:59
12:00:00
12:00:01
…
23:59:58
23:59:59
Anmerkung: Dabei ist es nicht notwendig, dass zwischen den einzelnen Ausgaben eine Sekunde lang gewartet wird.
Achten Sie aber darauf, dass alle Zahlen zweistellig ausgegeben werden, also in der folgenden Form:
00:00:00
statt
0:0:0
und
08:07:02
statt
8:7:2

	* */

	public static void main(String[] args) 
	{
		for (int std = 0; std < 24; std++)
		{
			for (int min = 0; min < 60; min++)
			{
				for (int sek = 0; sek < 60; sek++)
				{
					System.out.printf("%02d:%02d:%02d\n", std, min, sek);
				}
			}
		}
	}

}

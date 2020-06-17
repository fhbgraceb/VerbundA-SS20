package _glProg_MP_2;

public class Gleichungen 
{
	/*Schreiben Sie ein Programm, das die Lösung des folgenden Gleichungssystems findet:
3x + 7y - 4z = -37
 x –  y + 2z =  11
2x - 5y + 6z =  40
Dabei sind die Werte von x, y und z ganzzahlig und müssen im Bereich von -10 und 10 liegen, also:
-10 <= x <= 10
-10 <= y <= 10
-10 <= z <= 10

	* */
	public static void main(String[] args)
	{
		for (int x = -10; x <= 10; x++)
		{
			for (int y = -10; y <= 10; y++)
			{
				for (int z = -10; z <= 10; z++)
				{					
					if ((3 * x + 7 * y - 4 * z == -37)
						&& (x - y + 2 * z == 11)
						&& (2 * x - 5 * y + 6 * z == 40))
					{
						System.out.println("x= " + x + "; y = " + y + "; z = " + z);
					}
				}
			}
		}
	}

}

<<<<<<< HEAD
package mathematik;

public class LongUeberlauf 
{

	public static void main(String[] args) 
	{
		long n;
		
		n = (long)Math.pow(2, 63);	// Gr��te long-Zahl
		System.out.println("Gr��tes Long: " + n);
		System.out.println("--------------");
		
		n = n - 3;			// etwas verkleinern
		
		System.out.println("Versucht man bei dieser Zahl weiter zu z�hlen wird es negativ:");
		for (int i = 0; i < 9; i++)
		{
			System.out.println(n);
			n++;
		}
	}

}
=======
package mathematik;

public class LongUeberlauf 
{

	public static void main(String[] args) 
	{
		long n;
		
		n = (long)Math.pow(2, 63);	// Gr��te long-Zahl
		System.out.println("Gr��tes Long: " + n);
		System.out.println("--------------");
		
		n = n - 3;			// etwas verkleinern
		
		System.out.println("Versucht man bei dieser Zahl weiter zu z�hlen wird es negativ:");
		for (int i = 0; i < 9; i++)
		{
			System.out.println(n);
			n++;
		}
	}

}
>>>>>>> master

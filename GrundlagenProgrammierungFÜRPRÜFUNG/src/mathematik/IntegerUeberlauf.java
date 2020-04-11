package mathematik;

public class IntegerUeberlauf 
{

	public static void main(String[] args) 
	{
		int n;
		
		n = (int)Math.pow(2, 31);	// Größte int-Zahl
		System.out.println("Größtes Integer: " + n);
		System.out.println("--------------");
		
		n = n - 3;			// etwas verkleinern
		
		System.out.println("Versucht man bei dieser Zahl weiter zu zählen wird es negativ:");
		for (int i = 0; i < 9; i++)
		{
			System.out.println(n);
			n++;
		}
	}

}

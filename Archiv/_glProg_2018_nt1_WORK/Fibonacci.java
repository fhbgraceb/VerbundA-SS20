package _glProg_2018_nt1_WORK;

public class Fibonacci 
{

	public static void main(String[] args) 
	{
		final int anzahl = 40;
		int[] fibonacci = new int[anzahl];
		
		fibonacci[0] = 1;
		fibonacci[1] = 1;
		for (int i = 2; i < fibonacci.length; i++)
		{
			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//			System.out.println(fibonacci[i]);
		}
		
		System.out.println(fibonacci[anzahl - 1]);
	}

}

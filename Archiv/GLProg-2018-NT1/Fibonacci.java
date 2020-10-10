package _glProg_2018_nt1_WORK;

public class Fibonacci 
{
/*
Die erste Fibonacci-Zahl ist 1.
Die zweite Fibonacci-Zahl ist 1.
Alle weiteren Fibonacci-Zahlen berechnen sich wie folgt:
Die n. Fibonacci-Zahl ist die Summe der (n-1). Fibonacci-Zahl und der (n-2). Fibonacci-Zahl.
Die 3. Fibonacci- Zahl ist also die Summe der 2. Fibonacci-Zahl (1) und der 1. Fibonacci-Zahl (1) also 2.
Die 4. Fibonacci- Zahl ist die Summe der 3. Fibonacci-Zahl (2) und der 2. Fibonacci-Zahl (1) also 3.
Die ersten Fibonacci-Zahlen sind also:
1, 1, 2, 3, 5, 8, 13, …
Berechnen Sie die 40. Fibonacci-Zahl und geben sie diese aus.

* */

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

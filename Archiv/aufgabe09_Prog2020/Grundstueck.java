package aufgabe09;

public class Grundstueck 
{

	public static void main(String[] args) 
	{
		int breite;
		
		for (int laenge = 2; laenge <= 100; laenge++)
		{
			breite = laenge - 1;
			if ((laenge * breite) + 84 == ((laenge + 7) * (breite + 3)))
			{
				System.out.println("Das neue Grundstück misst " + (laenge + 7) 
									+ " * " + (breite + 3) + " Meter.");
//				System.out.println("*** Check ***");
//				System.out.println(laenge + " * " + breite + " = " + (laenge * breite));
//				System.out.println((laenge + 7) + " * " + (breite + 3) 
//									+ " = " + ((laenge + 7) * (breite + 3)));
			}
		}
	}

}

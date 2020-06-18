package _glProg_MP_2;

public class ErsterLetzter 
{

	public static String ersterLetzer(String wort)
	{
		String ersterLetzer = "";
		char erster;
		char letzter;
		
		if (wort.length() < 1) 
		{
			return null;
		}

		erster = wort.charAt(0);
		letzter = wort.charAt(0);
		for (int i = 0; i < wort.length(); i++)
		{
			char zeichen = wort.charAt(i);
			if (! (('A' <= zeichen) && (zeichen <= 'Z')))
			{
				return null;
			}
			if (zeichen < erster)
			{
				erster = zeichen;
			}
			if (zeichen > letzter)
			{
				letzter = zeichen;
			}
		}
		ersterLetzer = "" + erster + letzter;
		
		return ersterLetzer;
	}
	
	public static void main(String[] args) 
	{
		System.out.println(ersterLetzer("DGMBC"));		// BM
		System.out.println(ersterLetzer("C"));			// CC
		System.out.println(ersterLetzer("CCCCC"));		// CC
		System.out.println(ersterLetzer("ASDÖ"));		// null
	}

}

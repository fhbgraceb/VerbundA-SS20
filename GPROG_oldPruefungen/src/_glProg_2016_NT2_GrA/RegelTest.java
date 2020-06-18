package _glProg_2016_NT2_GrA;

public class RegelTest 
{

	public static void main(String[] args) 
	{
		System.out.println(regelKonform("autoBus"));
		System.out.println(regelKonform("druckerTreiber"));
		System.out.println(regelKonform("milchkuh"));
		System.out.println(regelKonform("aBcDeFgH"));
		System.out.println(regelKonform("java"));
		System.out.println(regelKonform("JavaKurs"));
		System.out.println(regelKonform("jaVa ist suPer!"));
		System.out.println(regelKonform("miTTelWert"));
		System.out.println(regelKonform("sonderMüll"));
	}
	
	public static boolean regelKonform(String string)
	{
		boolean ok = true;
		char c;
		boolean isUpperCase;	// Merkt sich, ob der letzte Buchstabe GROSS war
		
		if (! (string.length() >= 5))
		{
			ok = false;
		}
		else
		{
			isUpperCase = false;
			for (int i = 0; i < string.length(); i++)
			{
				c = string.charAt(i);
				if ((i == 0) && (Character.isUpperCase(c)))
				{
					ok = false;
				}
				if (! (((c >= 'A') && (c <= 'Z')) || ((c >= 'a') && (c <= 'z'))))
				{
					ok = false;
				}
				if (Character.isUpperCase(c))	// Ist der Buchstabe GROSS?
				{
					if (isUpperCase)			// Letzter Buchstabe war auch GROSS?
					{
						ok = false;
					}
					isUpperCase = true;
				}
				else
				{
					isUpperCase = false;
				}
			}
		}
		
		return ok;
	}
}

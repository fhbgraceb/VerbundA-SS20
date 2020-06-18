package aufgabe08_Prog2018;

/*
 * ZufallsString: 
 * 
 * Erzeugen Sie einen String, der aus 8 zuf‰llig
 * gew‰hlten Groﬂbuchstaben besteht.
 * 
 * Durch random() wird der Code des Zeichens erzeugt,
 * dieser dann in das Zeichen umgewandelt und 
 * 8 solche Zeichen zusammengeh‰ngt.
 */
public class ZufallsString 
{

	public static void main(String[] args) 
	{
		String ausgabe;
		char buchstabe;
		int code;
		
		ausgabe = "";
		for (int i = 1; i <= 8; i++)
		{
			code = (int)(Math.random() * ((int)'Z' - (int)'A' + 1) + (int)'A');
			buchstabe = (char)code;
			ausgabe += buchstabe;
		}
		System.out.println("Der ZufallsString lautet: " + ausgabe);
	}

}

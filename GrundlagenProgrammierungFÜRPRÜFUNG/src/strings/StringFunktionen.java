package strings;


public class StringFunktionen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		*/
		String s = "Java";
		//Strings vergleichen
		System.out.println(s=="Java"); //oder
		System.out.println(s.equals("Java"));
		
		s = "Hallo User!";
		//Anzahl der Zeichen
		System.out.println(s.length());
		
		//Zeichen an bestimmter Position
		//(erstes Zeichen hat Position 0)
		System.out.println(s.charAt(6));
		
		//Letzter Index eines Zeichens im String
		System.out.println(s.lastIndexOf("!"));
		
		//Kommt im Text ein bestimmtes Zeichen (oder mehrere) vor?
		//liefert true oder false
		System.out.println(s.contains("!"));
		
		//an welcher Stelle steht ein bestimmtes Zeichen (oder mehrere)? 
		System.out.println(s.indexOf("!"));
		
		//einen Teilstring eines Strings bestimmen
			//ab einer bestimmten Position bis ans Ende des Strings
		System.out.println(s.substring(6));
			//ab einer bestimmten Position zu einer definierten Position - 1
		System.out.println(s.substring(6,10));	//liefert User
		
		//Teilstring beliebiger Länge von links beginnend (z.B. 3 Zeichen)
		System.out.println(s.substring(0,3));
		
		//Teilstring beliebiger Länge von rechts beginnend (z.B. 3 Zeichen)
		System.out.println(s.substring(s.length()-3));
		
		//bestimmte Zeichen eines Strings ersetzen
		s="qsylophon";
		System.out.println(s.replace("qs", "x"));
		s=s.replace("qs", "x");
				
		//String startet oder endet mit bestimmter Zeichenkette (true oder false)
		System.out.println(s.startsWith("xy"));
		System.out.println(s.endsWith("hom"));
		
		//String, der durch Delimiter geteilt ist, in Einzelstrings zerlegen
		s="Karli-Gerda-Fredi";
		String temp[];
		temp=s.split("-");
		System.out.println("Name1: " + temp[0] + " Name2: " +temp[1] + " Name3: " +temp[2] );
		
		//beginnende und endende Leerzeichen aus String entfernen
		s="   Hallo User!   ";
		System.out.println(s.trim());
		System.out.println(s.trim().length());
		
		//right trim (Leerzeichen am rechten Ende des Strings entfernen
		System.out.println(s.replaceAll("\\s+$", ""));

		//left trim (Leerzeichen am Beginn des Strings entfernen
		System.out.println(s.replaceAll("^\\s+", ""));

		
		//ist String ein Leerstring (hat die Länge 0!)-liefert true oder false
		s="";
		System.out.println(s.isEmpty());
				
		
		//String in Groß-Kleinbuchstaben umwandeln
		System.out.println(s.toUpperCase());	//in Großbuchstaben
		System.out.println(s.toLowerCase());	//in Kleinbuchstaben
		
		//ASCII Code eines Zeichens ausgeben
		System.out.println((int) 'A');		
		//ASCII Code in ein Zeichen (Buchstaben) umwandeln
		System.out.println((char) 65);			
		
		//Typenkonvertierungen
		//Es können grundsätzlich alle Datentypen in einen anderen Typ
		//konvertiert werden.
		s="3.67";
		float f = Float.parseFloat(s); //oder
		double d = Double.parseDouble(s);
		s="6";
		byte b = Byte.parseByte(s); //oder
		int i = Integer.parseInt(s);
		
		String z = String.valueOf(i);
		
		
	}

}

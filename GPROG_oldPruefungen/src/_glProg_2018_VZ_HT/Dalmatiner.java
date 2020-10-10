package _glProg_2018_VZ_HT;

public class Dalmatiner {

	public static void main(String[] args) {
		int anzahlDalamtiner = 101;
		
		for (int mickey = 1; mickey < anzahlDalamtiner; mickey++) {
			for (int donald = 1; donald < anzahlDalamtiner; donald++) {
				for (int goofy = 1; goofy < anzahlDalamtiner; goofy++) {
					int summe = mickey + donald + goofy;
					if ((summe < anzahlDalamtiner)  
						&& (summe > 17) 
						&& (mickey > (donald + goofy) * 2) 
						&& (donald == goofy + 3)) {
						System.out.println("Mickey: " + mickey + " Donald: " + donald + " Goofy: " + goofy);
					}
				}
			}
		}
	}

}

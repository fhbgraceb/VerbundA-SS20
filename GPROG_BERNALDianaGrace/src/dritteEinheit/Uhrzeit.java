package dritteEinheit;

import java.time.*; 

public class Uhrzeit {

	public static void main(String[] args)  {
	//public static void main(String[] args) throws InterruptedException {
		// create a Zone Id for Europe/Paris 
		ZoneId zoneId = ZoneId.of("Europe/Vienna"); 

		// create Clock with system(zoneId) method 
		Clock clock = Clock.system(zoneId); 

		// get instant of class 
		Instant instant = clock.instant(); 

		// get ZonedDateTime object from instantObj to get date time 
		ZonedDateTime time = instant.atZone(clock.getZone()); 

		// print details of time 
		System.out.println("Instant for class is " + time.toString()); 

//		for (int stunde = 0; stunde < 24; stunde++) {
//			for (int minute = 0; minute < 60; minute++) {
//				for (int sekunde = 0; sekunde < 60; sekunde++) {
//					//kurz schreibweise f�r if anweisung; ""+ --> casten von string to int
//					String stu = stunde<10?("0"+stunde):""+stunde;
//					String min = minute<10?("0"+minute):""+minute;
//					String sek = sekunde<10?("0"+sekunde):""+sekunde;
//					
//					System.out.println(stunde+":"+minute+":"+sekunde);
//					Thread.sleep(1000);
//				}		
//			}
//		}
	
	}
	
	

}
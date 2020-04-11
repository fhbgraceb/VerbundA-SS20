package ifs_switch;


public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a;
		
		a = 'a';
		
		switch(a){
		case 'a':
			System.out.println("a");
			break;		//ohne break kommt es zu einem Durchfallen
		case 'b':
			break;
		case 'c':
			System.out.println("c");
			break;
		case 'd':
			System.out.println( "d" );
			break;
		default:
			System.out.println( "anders" );
		}
	}

}
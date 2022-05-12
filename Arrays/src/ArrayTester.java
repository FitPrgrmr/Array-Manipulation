
public class ArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Individual man1 = new Individual();
		Individual man2 = new Individual();
		Individual man3 = new Individual();
		
		
		
		
		
		
		int[] ages1 = new int[7];
		ages1[0] = 10;
		ages1[1] = 20;
		ages1[2] = 30;
		ages1[3] = 40;
		ages1[4] = 50;
		ages1[5] = 60;
		ages1[6] = 70;
		
		int muchOlder = ages1[6] + 10;
		int length = man1.names[5].length();
		
		int[] ages2 = new int[7];
		ages2[1] = 20;
		ages2[1] = 21;
		ages2[2] = 40;
		ages2[3] = 23;
		ages2[1] = 24;
		ages2[5] = 25;
		ages2[6] = 26;
		
		int[] ages3 = {19, 22, 23, 33,50};
		
		
		
		System.out.println(ages1[0]);
		System.out.println(ages3[1]);
		System.out.println(ages3[4]);
		
		
		
		
		if(ages1[3] > ages3[2]) {
			System.out.println("This Individual's name is " + man1.names[2] + "," + " " + "he's age is " + man1.agesg2[0]);
		}else { System.out.println("This Individual's name is " +  man2.names[4]+ "," + " " + "he's age is " + man2.agesg2[4]);}
		
		{System.out.println("This Individual's name is " + man3.names[4] + "," + " " + "he's age is " + muchOlder);
	System.out.println("the name of " + man1.names[5] + " contains " + length + " characters" );}
	
	
	if( man1.names[2] == man1.names[2]) {
		
		System.out.println("This Individual's name is " + man1.names[0] + "," + " " + "her age is " + man1.agesg2[0]);
		
	}else {System.out.println("No comment");}
	
		

	} 

}

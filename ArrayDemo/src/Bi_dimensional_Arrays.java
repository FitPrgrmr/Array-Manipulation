/*
 *@author Jimmeh Camara
 */
public class Bi_dimensional_Arrays {

	public static void main(String[] args) {
		
		int [][] arr = new int [2][6];//2 elements that are each able to refer to 6 objects
		//12 total accessible elements
		
		arr[0][0] = 45;
		arr[0][1] = 46;
		arr[0][5] = 52;
		System.out.println(" # of references that can access "+ arr[0].length+" other elements is\n"+ arr.length+" \nlength of each inner array " + arr[0].length);
		System.out.println("array's length is: " + arr.length);
		int x = 1;
		
		for(int i = 0; i < arr.length;i++ ) {
			System.out.println("\n in outer loop\n");
			for(int j = 0; j < arr[0].length; j++) {
				
			System.out.println("in inner loop");
			System.out.println(arr[i][j]);
			
			}
			
		}

	}
}



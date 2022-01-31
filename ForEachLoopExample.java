import java.lang.reflect.Array;

public class ForEachLoopExample {
	public static void main(String[] args) {
		
		int[] array1= new int[5];  // declaration
		
		int[] array2 = {12,23,43,12,34,5};  // declaring and defining
		
		array1[1] = 33;   // defining array1
		array1[0] = 89;
		array1[2] = 45;
		array1[3] = 23;
		array1[4] = 56;
		
		System.out.print(array1[0]+ " ");
		
		System.out.print(array2[0]);
		
		System.out.println();
		for(int i=0; i<array1.length; i= i+2) {
			System.out.print(array1[i]+ " ");
		}
		
		System.out.println();
		for(int j: array1) {                     // for each loop
			System.out.print(j+ " ");
			
		}	
	}
}


public class ExceptExample {
	
	public static void main(String[] args) {
		
		int a= 23;
		int b= 12;
		int c =0;
		
		int d= a/b;
		System.out.println(d);
		
		try {
		int e= a/c;
		//System.out.println(e);
		System.out.println("All is well");
		} catch(ArithmeticException e) {
			System.out.println("now in the catch block");
			System.out.println(e);
		}
		finally {
			System.out.println("now in the finally block");
		}
		
		System.out.println("End of the program");
		
		int[] arr= {3,2,5,7};
		
		// arr[6] = 100;
	}

}

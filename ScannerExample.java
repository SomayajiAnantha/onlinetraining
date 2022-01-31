import java.util.*;

public class ScannerExample {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String name;
		int id;
		
		System.out.println("Please Enter Your Name: ");
		name = sc.next();
		
		System.out.println("Please Enter Your ID: ");
		id=sc.nextInt();
		
		System.out.println("The entered name is: "+ name);
		System.out.println("The entered id is: "+ id);
	}

}

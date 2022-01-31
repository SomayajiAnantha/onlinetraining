import java.util.*;

public class ConOpExample {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, big, small;
		
		System.out.println("Enter the first number: ");
		
		num1= sc.nextInt();
		
		System.out.println("Enter the second number: ");
		
		num2= sc.nextInt();
		
		big=(num1>num2)? num1: num2;
		
		small=(num1<num2)? num1:num2;
		
		System.out.println("The big is: "+ big + " and the small is: "+ small);
		
	}	

}

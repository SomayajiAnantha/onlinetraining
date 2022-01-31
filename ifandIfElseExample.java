import java.util.Scanner;

public class ifandIfElseExample {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1, num2, big, small;
		
		System.out.println("Enter the first number: ");
		
		num1= sc.nextInt();
		
		System.out.println("Enter the second number: ");
		
		num2= sc.nextInt();
		
		if (num1>=num2) {
			System.out.println("num1 is greater than num2 or may be equal to num2");
		}
		
		if(num1==num2) {
			System.out.println("both the numbers are equal");
		}else {
			System.out.println("both the numbers are different");
		}
 }

}

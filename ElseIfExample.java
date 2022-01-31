import java.util.Scanner;

public class ElseIfExample {
public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int num1;
		
		System.out.println("Enter the first number: ");
		
		num1= sc.nextInt();
		
		if(num1>=70) {
			System.out.println("Scored a Distinction");
			}else if (num1>=60) {
				System.out.println("Scored a FirstClass");
				}else if (num1>=50) {
					System.out.println("Scored a SecondClass");
					}else if (num1>=40) {
						System.out.println("Scored a PassClass");
						}else {
							System.out.println("Sorry, Got Fail");
							}
  }

}

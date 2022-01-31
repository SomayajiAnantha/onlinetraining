import java.util.*;
public class ForLoopExample {
	public static void main(String[] args) {
		
		int i;
		
		for(i=0;i<=10; i=i+1) {                        // i++ , ++i, i+=1 can be used
			System.out.println("5 x "+i + " = "+ 5*i);
		}
		
		i=1;
		for (; ; ) {
			System.out.println("5 x "+i + " = "+ 5*i);
			i=i+1;
			if(i>10) {
				break;
			}
		}
		
		System.out.println("End value of i is: "+i);
		
		Scanner kb= new Scanner(System.in);
		
		String s;
		
		char ch;
		
		for (;;) {
			System.out.println("Enter a character");
			s=kb.next();
			ch= s.charAt(0);
			if(ch=='x') {
				System.out.println("You entered 'x', Good Bye");
				break;
			}
		}
	}

}


public class BreakAndContinue {
	
	public static void main(String[] args) {
	
	for(int i = 0; i<100; i++) {
		if (i%4==0) {
			continue;
		}
		System.out.print(i+" ");
		
		if (i%23==0) {
			break;
		}
	 }
  }

}

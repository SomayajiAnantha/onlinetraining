
public class StaticBlock {
	static { System.out.println("I am the first to be printed, I am static block");}
	
	public static void main(String[] args) {
	  System.out.println("But I am in the main method");
	}
	static { System.out.println("I am the Second to be printed, I am static block");}
}

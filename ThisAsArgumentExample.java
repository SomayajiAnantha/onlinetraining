
public class ThisAsArgumentExample {
	
	String name = "Somebody";
	
	void disp(ThisAsArgumentExample obj) {
		System.out.println(obj.name);
	}
	
	void p() {
		disp(this);
	}
	
	public static void main(String[] args) {
		ThisAsArgumentExample ob= new ThisAsArgumentExample();
		
		ob.p();
	}

}

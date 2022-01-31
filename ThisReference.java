
public class ThisReference {
	
	void m() {
		System.out.println(this);
	}
	
	void d() {
		
		this.m();
	}
	public static void main(String[] args) {
		
		ThisReference obj = new ThisReference();
		
		// this.m();
		obj.m();
		obj.d();
		System.out.println(obj);
	}

}

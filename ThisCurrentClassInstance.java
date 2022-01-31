
class A{
	
	A getA() {
		return this;
	}
	void msg() {
		System.out.println("Hi Hi");
	}
}

public class ThisCurrentClassInstance {
	public static void main(String[] args) {
		
		A a= new A();
		a.msg();
		
		new A().getA().msg();
		new A().msg();
	}
}

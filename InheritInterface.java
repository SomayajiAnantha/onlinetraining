interface Aone{
	void saysomething();
	default void neversay() {
		System.out.println("interfaces can have only abstract methods");
	}
	static void say() {
		System.out.println(" I am the best person in the world");
	}
}

interface B extends Aone{
	void tellsomething();
}

class C implements B{
	public void saysomething() {
		System.out.println("Always be Cool");
	}
	public void tellsomething() {
		System.out.println("Never Panic");
	}
}
public class InheritInterface {
	public static void main(String[] args) {
		C obj= new C();
		
		obj.saysomething();
		obj.tellsomething();
		obj.neversay();
		Aone.say();
	}
}

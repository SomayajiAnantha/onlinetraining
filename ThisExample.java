
public class ThisExample {
	String name;
	int age;
	
	ThisExample(){System.out.println("SimpleWayOut");}
	
	ThisExample(String name, int age){
		this();
		this.name = name;
		this.age = age;
	}
	void func() {
		System.out.println("made to use by applying this to the method");
	}
	
	void display() {
		System.out.println("name is: "+ name +" and the age is: " +age);
		this.func();
	}
	
	public static void main(String[] args) {
		ThisExample m=new ThisExample("Sham", 32);
		m.display();
	}

}

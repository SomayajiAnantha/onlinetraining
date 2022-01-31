interface displayable{
	void show();
}

interface showable{
	void print();
	void show();
}

class Mult implements displayable,showable{
	public void print() {
		System.out.println(" implements showable");
	}
	
	public void show() {
		System.out.println(" No ambiguity");
	}
}
public class MultInheritInterface {
	public static void main(String[] args) {
	
	Mult ob=new Mult();
	
	ob.print();
	ob.show();
	}
}

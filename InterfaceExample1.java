interface printable{
	void print();
}

class Laser implements printable{
	public void print() {
		System.out.println(" Printing done in a Laser Printer");
	}
}

class Inkjet implements printable{
	public void print() {
		System.out.println(" Printing done in a Inkjet Printer");
	}
}
public class InterfaceExample1{
   
	public static void main(String[] args) {
		
		printable l1= new Laser(); // upcasting
		Laser l2 = new Laser();
		
		Inkjet i3=new Inkjet();
		
		l1.print();
		l2.print();
		i3.print();	
	}
}

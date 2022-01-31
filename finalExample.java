class Bthree{
	final int speed = 110;
	final int gear;
	static final String brake;
	
	static {brake = "handbreak";}
	
	Bthree(){
	//	speed = 120;
		gear=5;
//		brake = "handbreak";
		System.out.println("The speed is: "+speed);
	}
	
	 final void display() {
		System.out.println(" I can not be over-rided as I am the final");
	}
}
class Cone extends Bthree{
	
//	void display() {
//		System.out.println(" I am over-riding the parent method");
//	}
}
public class finalExample {	
	public static void main(String[] args) {
		Bthree b1=new Bthree();
		b1.display();
		Cone c1= new Cone();
		c1.display();
		System.out.println(c1.gear);
		System.out.println(Cone.brake);
	}
}

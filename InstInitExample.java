class Jeep{
	int speed;
	
	Jeep(){
		System.out.println(" speed is: "+ speed);
	}
	
	{ System.out.println("Speed is set");
	speed =110;}
	{System.out.println("Instance Initializer Invoked First");}
	{System.out.println("Second Instance Initializer Invoked First");}
}

class Scorpio extends Jeep{
	int drivewheel;
	Scorpio(){
		System.out.println("I am Scorpio, I am a "+ drivewheel+ " wheeldrive");
	}
	
	{drivewheel = 4;}
}
public class InstInitExample {
	public static void main(String[] args) {
	Scorpio s1= new Scorpio();
	}
}

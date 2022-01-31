class One{
	One(){
		System.out.println("From class One");
	}
}

class Two extends One{
	Two(){
		// super();
		System.out.println("From class Two");
	}
}

public class SuperConstructor {
	public static void main(String[] args) {
		
		Two obj = new Two();
	}

}

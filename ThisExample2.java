
public class ThisExample2 {
	ThisExample2(){
		this(10);
		System.out.println(" Printing ");
	}
	
	ThisExample2(int x){
		System.out.println("number is: "+ x);
	}
	
	public static void main(String[] args) {
		ThisExample2 a2=new ThisExample2();
	}

}

interface five{
	void disp();
	class Six{
		String name = "My name";
		public void disp() {
			System.out.println(name);
		}
	}
}

public class NestingClassInInterface implements five{
	String name="Your name";
	public void disp() {
		System.out.println(name);
	}
	
	public static void main(String[] agrs) {
		
		Six obj1=new Six();
		obj1.disp();
		
		five obj2= new NestingClassInInterface();
		
		obj2.disp();
	}

}

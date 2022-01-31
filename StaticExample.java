class Samplestatic{
	static int count=0;
	
	int ticks = 12;
	
	Samplestatic(){
		count=count+1;
		System.out.println(count);
	}
	
	 static void disp() {
		count = 10;
		//ticks = 3;
		System.out.println(count);
		System.out.println(" I am static method and belong to whole class");
	}
	 
	 void change() {
		 count =20;
		 ticks = 5;
		 System.out.println(count);
	 }
}
public class StaticExample {
	public static void main(String[] args) {
	Samplestatic s1= new Samplestatic();
	Samplestatic s2= new Samplestatic();
	Samplestatic s3= new Samplestatic();
	
	Samplestatic.disp();
    
	Samplestatic s4= new Samplestatic();
	
	s4.change();
		
	
	}

}

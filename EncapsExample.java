class Student{
	
	 private static int count=0;
	
	Student(){
		count = count+1;
		System.out.println("The number of students is: "+ count);
	}
}
public class EncapsExample {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		// try access s1.count= 10;
	}

}

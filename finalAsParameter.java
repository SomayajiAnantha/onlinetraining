class Maths1{
	
	int cube( final int n) {
//		n=n+1;  this gives error
//		return n*n*n;
		int b= n;
		b=b+1;
		return b*b*b;
	}
}
public class finalAsParameter {
	public static void main(String[] args) {
		
		Maths1 m1= new Maths1();
		System.out.println(m1.cube(6));
	}
}

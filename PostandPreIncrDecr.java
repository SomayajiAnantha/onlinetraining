
public class PostandPreIncrDecr {
	public static void main(String[] args) {
		
		int num;
		
		num = 10;
		
		int post= num++; /// doing a post increment  n++ means num= num+1;
		System.out.println(post);
		System.out.println(num);
		
		num=10;
		int postdecr= num--;
		System.out.println(postdecr);
		System.out.println(num);
		
        num = 10;
		
		int pre= ++num; /// doing a pre increment  ++num means num= num+1;
		System.out.println(pre);
		System.out.println(num);
		
		num=10;
		int predecr= --num;
		System.out.println(predecr);
		System.out.println(num);
		
		// "int c = num++" is not same as "int c= ++num"
		
	}

}

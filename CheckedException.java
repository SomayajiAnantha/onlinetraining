import java.io.*;

public class CheckedException {
	
	public static void main(String[] args) {
		PrintWriter pw;
		
		try {
			pw=new PrintWriter("abc.txt");
			pw.println("Saved");
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}
		
		System.out.println("End of Program");
		//pw.close();
	}

}

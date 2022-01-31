class Afour{
	interface Afive{
		void always();
	}
}

class Asix implements Afour.Afive{
	public void always() {
		System.out.println(" Let the light come from any where");
	}
}
public class NestedClassInterface {
	public static void main(String[] args) {
		Asix a=new Asix();
		a.always();
	}

}

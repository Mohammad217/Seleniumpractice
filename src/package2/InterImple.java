package package2;

public class InterImple implements Interff {

	public static void main(String[] args) {
		InterImple ii=new InterImple();
		ii.test1();
		ii.test2();

	}

	
	public void test1() {
		
		System.out.println("This is first method for the implementation");
	}

	
	public void test2() {
		
		System.out.println("This is the second method for the implementation");
		
	}

}

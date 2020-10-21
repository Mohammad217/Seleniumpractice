package pk3;

public class Testclass extends Exec{

	static int aa;
	
	public static void main(String[] args) {
		
		Testclass t=new Testclass();
		setA(2000);
		setB("Hello");
		
		//System.out.println(getA());
		//System.out.println(getB());
		t.test(200);
		System.out.println(aa);
	}

	
	public  void test(int aa){
		
		this.aa=aa;
		
	}
}

package package1;

public class ThisConcept {
	
	
	static int a;

	public static void main(String[] args) {
		
		ThisConcept th=new ThisConcept();

		th.test(200);
		
		System.out.println(a);
	}
	
	
	public void test(int a){
		
		this.a=a;
		
		
	}

}

package package1;

public class Overloadingconcept {

	public static void main(String[] args) {



	}
	
	
	
	public static void test(){
		
		System.out.println("This is defautl overloading method ");
	}

	
	public static void test(String a){
		
		System.out.println("This is defautl overloading method "+a);
	}
	
	public static void test(int a){
		
		System.out.println("This is defautl overloading method "+a);
	}
	
	public static void test(int a,int b){
		
		System.out.println("This is defautl overloading method "+a+b);
	}
}

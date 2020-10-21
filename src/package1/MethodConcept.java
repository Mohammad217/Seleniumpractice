package package1;


public class MethodConcept {
	
	static int abc=100;

	public static void main(String[] args) {
		
		MethodConcept mc=new MethodConcept();
		
		teststatic();
		mc.test2();
		mc.teststatic();
		mc.calmethod();
		mc.calparameter(200, 200);
		mc.calparameter(4000, 4345);
		System.out.println(abc);
		int tt=mc.calparameterreturn(23, 45);
		System.out.println(tt);
		System.out.println(mc.calparameterreturn(23, 45));
		System.out.println(mc.calparameterreturn(23, 45)+200);
		

	}
	
	public static void teststatic(){
		 int a=10;
		System.out.println("This is the static method 1"+abc);
		
	}
		
	public void test2(){
		
		System.out.println("This is a non static method 22"+abc);
	}
	
	
	public void calmethod(){
		
		System.out.println(20+30);
		
	}
		
	public void calparameter(int a,int b){
		
		System.out.println(a+b);
		int xy=200;
		
		System.out.println(a+b+xy);
	}
	
	
	public void calparameter1(int a,int b,String cc){
		
		System.out.println(a+b);
		int xy=200;
		
		System.out.println(a+b+xy+cc);
	}
	
	public int calparameterreturn(int a,int b){
	
		int calresult=a+b-1;
		return calresult;
		
	}
	
	public String  calparameter(String a,String b,String c){
		
		String calresult=a+b+c;
		return calresult;
		
	}
	
	
}

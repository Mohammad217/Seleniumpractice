package package1;

public class AccessModifer {
	
	
	
	public static void main(String[] args) {
		
		AccessModifer aa=new AccessModifer();
		
		System.out.println(aa.test(200));

	}
	
	
	public static int a=100;

 public static void publicClass(){
	 
	 System.out.println("This is a public method "+a);
 }
	
 
 private static void PrivateClass(){
	 
	 System.out.println("This is a Private method ");
 }
	
 
  static void defaultClass(){
	 
	 System.out.println("This is a default method "+a);
 }
  
  
  protected static void protectedClass(){
		 
		 System.out.println("This is a protected method ");
	 }
  
  public  int test(int aa){
	  
	  return aa;
	 
  }
  
}

package package1;

public class ForLoopConcept {

	public static void main(String[] args) {
		
      //For loop Example 
	
		//1-10 begin value=1  end value=10
		
		
//		for(int i=1;i<=100;i++){//i=i+1
//			
//			System.out.println(i);
//		}
		
		
		//50-0 interval 3
		
		
//		for(int i=50;i>=0;i=i-3){
//			
//			System.out.println(i);
//		}
		
		
		// While Loop   10-50
		
		
//		int i=10;
//		
//		while(i<=50){
//			
//			System.out.println(i);
//			i=i+5;
//		}
		
		
		
//		int i=10;
//		
//		do{
//			
//			System.out.println(i);
//			i=i+5;
//		}while(i<=50);
		
		
		//   loop and 1-10 but when value =6 should not print 
		
		boolean a=true;
		
		while(a==true){
		
		for(int i=1;i<=10;i++){
			
			if(i==6){
				
				a=false;
				break;
				
			}
			else
			{
				System.out.println(i);
			}
		}
		}
	}

}

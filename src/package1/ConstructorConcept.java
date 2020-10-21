package package1;

public class ConstructorConcept {

	public static void main(String[] args) {

		ConstructorConcept stt=new ConstructorConcept();
		
		stt.ConstructorConcept();
		stt.ConstructorConcept("Hello");
		

	}

	
	
	
	public void ConstructorConcept(){
		
		System.out.println("This is default constructor ");
	}
	
	
	
	public void ConstructorConcept(String st){ //Constructor overloading 
		
		System.out.println("This is default constructor "+ st);
	}
	
}

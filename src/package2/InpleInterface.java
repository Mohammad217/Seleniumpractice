package package2;

public  class InpleInterface  implements InterfaceBackup {

	public static void main(String[] args) {
		
		InpleInterface i=new InpleInterface();
		
		i.test1();
		i.test2();

	}


	public void test1() {
		System.out.println("Test1");
		
	}

	
	public void test2() {
		
		System.out.println("Test2");
	}

}

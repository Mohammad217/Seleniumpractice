package package1;

public class Inherconcept {

	public static void main(String[] args) {
		
		InheratanceParent inh=new InheratanceParent();
		MethodConcept mot=new MethodConcept();
		
		inh.staicmethod();
		inh.nonstaticmethod();
		mot.calmethod();
		mot.calparameter(200, 200);
		

	}

}

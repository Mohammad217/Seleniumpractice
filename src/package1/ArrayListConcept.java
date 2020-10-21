package package1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListConcept {
	
	
	public static void main(String[] args) {
		int[] ss={34,44,44};
		
		List x=new ArrayList();
		
		x.add(234);
		x.add(45435);
		x.add(45435);
		x.add(45435);
		
		System.out.println( x);
		System.out.println(x.get(1));
		
		x.add(45435);
		x.add(435);
		
		System.out.println( x);
		

//		for(int i=0;i<x.size();i++){
//			
//			System.out.println(x.get(i));
//		}
		
		
		Iterator son = x.iterator();
		
		while(son.hasNext()){
			
			System.out.println(son.next());
		}
		
	}
	
	
	

}

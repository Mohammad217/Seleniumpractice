package package2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListBackup {

	public static void main(String[] args) {
		
		List ar=new ArrayList();
		ar.add(34);
		ar.add(44);
		ar.add(66);
		
		System.out.println(ar);
		System.out.println(ar.get(0));
		
		
		Iterator st = ar.iterator();
		
		while(st.hasNext()){
			
			System.out.println(st.next());
		}

	}

}

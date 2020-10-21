package pk3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListexample {

	public static void main(String[] args) {

		int[] a={23,56,34,56};
		List ll=new ArrayList();
		
		for(int i=0;i<a.length;i++){
			ll.add(a[i]);
		}
		System.out.println(ll);
		ll.clear();
		System.out.println(ll);
		
		for(int j=0;j<a.length;j++){
			ll.add(a[j]);
		}
		System.out.println(ll);
	}

}

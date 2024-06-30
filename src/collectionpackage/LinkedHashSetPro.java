package collectionpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedHashSet<Integer> li = new LinkedHashSet<Integer>();
		
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		System.out.println("LinkedHashSet is : "+li);
		
		Boolean removeElement = li.remove(1);
		System.out.println("Removed element is : "+removeElement);
		
		boolean value = li.removeAll(li);
		System.out.println("Remove all numbers : "+value);
		
		
		Iterator itr = li.iterator();
		System.out.println("LinkedHashSet iterator is : ");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}

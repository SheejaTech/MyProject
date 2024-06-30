package collectionpackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> li = new HashSet<Integer>();
		li.add(1);
		li.add(2);
		li.add(3);
		li.add(4);
		li.add(5);
		System.out.println("HashSet is : "+li);
		
		li.remove(3);
		System.out.println("Remove element is : "+li);
		
		HashSet<Integer> li1 = new HashSet<Integer>();
		li1.addAll(li);
		li1.add(6);
		System.out.println("Add all elements in : "+li1);
		
		
		//for accessing
		Iterator itr = li.iterator();
		System.out.print("HashSet iterator : ");
		while(itr.hasNext()) {
			System.out.print(itr.next());
			System.out.print(",");
		}
		


	}

}

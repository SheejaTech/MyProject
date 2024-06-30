package collectionpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new ArrayList();
		List li1 = new ArrayList();
		
		
		
		li.add(10);
		li.add("Nasneen");
		li.add(20);
		li.add(10);
		System.out.println(li);
		li.add("manu");
		
		//for accessing
		for(int i=0; i<5; i++ ) {
			System.out.println(li.get(i));
		}
		li.remove(1); //for removing
		
		li1.addAll(li);
		System.out.println("New list : "+li1);//li all details added to li1
		
		Iterator itr = li.iterator(); //for accessing
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		


	}

}

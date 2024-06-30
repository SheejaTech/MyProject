package collectionpackage;

import java.util.ArrayDeque;

public class ArrayDequePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayDeque<String> li = new ArrayDeque<String>();
		
		li.add("Welcome");
		li.add("to");
		li.add("Java");
		li.add("Programming");
		
		System.out.println(li);
		li.addFirst("Nasneen");
		System.out.println("adding to li : "+li);
		
		li.addLast("testing batch");
		System.out.println("adding to last : "+li);
		
		li.pollFirst();
		System.out.println("delete first : "+li);
		
		li.pollLast();
		System.out.println("delete last : "+li);
		
		System.out.println("Print first element : "+li.peekFirst());
		System.out.println("Print last element : "+li.peekLast());
		

	}

}

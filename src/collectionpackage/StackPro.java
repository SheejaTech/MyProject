package collectionpackage;

import java.util.Stack;

public class StackPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Stack li = new Stack();
		
		li.push(20);
		li.push("Nasneen");
		li.push(10);
		li.push("Seethal");
		
		System.out.println("Datas are : "+li);
		System.out.println("Remove the last element : "+li.peek());
		li.pop();
		System.out.println("Delete top element : "+li);
		


	}

}

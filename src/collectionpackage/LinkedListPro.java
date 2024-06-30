package collectionpackage;

import java.util.LinkedList;

public class LinkedListPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String> li = new LinkedList();
		
		li.add("Nasneen");
		li.add("10");
		li.add("Nazmin");
		li.add("20");
		
		System.out.println("Datas are : ");
		for(String data : li) {//similar data type we have to use foreach loop
			System.out.println(data);
		}

	}

}

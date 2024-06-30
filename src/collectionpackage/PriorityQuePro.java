package collectionpackage;

import java.util.PriorityQueue;

public class PriorityQuePro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> li = new PriorityQueue<String>();
		li.add("Nasneen");
		li.add("Nazmin");
		li.add("10");
		li.add("20");
		
		System.out.println("Data are : ");
		for(String data : li) {
			System.out.println(data);
			
		}
		li.remove();
		System.out.println(li);


	}

}

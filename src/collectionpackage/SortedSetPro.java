package collectionpackage;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SortedSet<Integer> num = new TreeSet<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		System.out.println("Integer number is : "+num);
		
		int firsttNumber = num.first();
		System.out.println("First number : "+firsttNumber);
		
		System.out.println("Remove elements in : "+num.remove(1));
		
		System.out.println("Last number : "+num.last());


	}

}

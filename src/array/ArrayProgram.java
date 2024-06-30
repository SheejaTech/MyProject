package array;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration
				int mark[] = new int[5];
				
				//initilzation
				mark[0] = 50;
				mark[1] = 49;
				mark[2] = 90;
				mark[3] = 59;
				mark[4] = 80;
				
				System.out.println(mark[4]);
				System.out.println();
				
				for(int j=0; j<mark.length; j++) {
					System.out.println(mark[j]);
				}
				
			//declaration with initalization
				
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the size of array : ");
				int size= scan.nextInt();
				
				int marks[] = new int[size];
				
				//entering values
				System.out.println("Enter the numbers : ");
				for(int i=0; i<marks.length; i++) {
					marks[i] = scan.nextInt();
				}
				
				//accessing values
				for(int i=0; i<marks.length; i++) {
					System.out.println(marks[i]);
				}
				
			}



}

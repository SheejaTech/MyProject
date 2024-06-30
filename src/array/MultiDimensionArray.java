package array;

public class MultiDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 10;

		arr[2][0] = 90;
		arr[2][1] = 80;
		arr[2][2] = 10;
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int array[][] = {{1,2,3,4},{4,5,6,7},{8,9,3,2}};
		for(int i = 0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}


	}



package basic_pkg;

public class Instance_Variable {
		
		int num = 10;
		
		public void display() {
			
			System.out.println("first number : "+num );
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instance_Variable obj = new Instance_Variable();
	       obj.num = 20;
	       System.out.println("Number is : " +obj.num);
	       obj.display();


	}
	
	}




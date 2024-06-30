package array;

public class StringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char myarr[] = {'H','E','L','L','O'};
		System.out.println(myarr);
		
		for(int i=0; i<myarr.length; i++) {
			System.out.println(myarr[i]);
			
		}
		
		//string literals
		
		String val = "Nasneen";
		System.out.println(val);
		String val1 = "Nasneen";
		System.out.println(val1);
		System.out.println(val==val1);
		
		String val2 = "Nasneen";
		val2 = val2+"Zaelyn";
		System.out.println(val2);
		
		
		//new
		String name = new String("Nasneen");
		System.out.println(val==name);
		
		System.out.println(val.equals(name));
		
		//string program
		
		String name1 = "Anu";
		String newName = "Joesph";
		System.out.println(name1+newName);
		System.out.println(name1.concat(newName));
		
		name.concat(newName);
		System.out.println(name1);
		
		//String Buffer and Builder
		StringBuffer name2 =  new StringBuffer("Poul");
		StringBuffer name3 =  new StringBuffer("Babu");
		name2.append(name3);
		System.out.println("name 2 is : "+name2);
		name2.append("House");
		System.out.println(name2);
		
		String Name1 = "Robert";
		String Name2 = "Robert";
		String Name3 = new String ("Robert");
		String Name4 = new String ("robert");
		String Name5 = "Anu";
		String Name6 = "Nasneen";
		
		System.out.println("Name1==Name2 : "+(Name1==Name2));
		System.out.println("Name1==Name3 : "+(Name1==Name3));
		System.out.println("Name1 equals Name3 : "+(Name1.equals(Name3)));
		System.out.println("Name1 equals Name4 : "+(Name1.equalsIgnoreCase(Name4))); //Only check the length ignore case sensitive
		
		System.out.println("Length is : "+(Name1.length()));
		System.out.println("CharAt is : "+(Name1.charAt(4))); //staring index of 0
		System.out.println("Lowercase is : "+(Name1.toLowerCase()));
		System.out.println("Uppercase is : "+(Name1.toUpperCase()));
		System.out.println("Compareto  is : "+(Name1.compareTo(Name5)));
		System.out.println("Compareto  is : "+(Name5.compareTo(Name6)));
		
		

	}


	}



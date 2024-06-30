package basic_pkg;

public class InstanceStaticVariables {
	String studname;
	int age;
	static String course = "Manual Testing";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceStaticVariables stud1 = new InstanceStaticVariables();
		System.out.println("Student name = "+(stud1.studname = "Nasneen"));
		System.out.println("Student age = "+(stud1.age = 26));
		System.out.println("Course = "+course);
		System.out.println();
		InstanceStaticVariables stud2 = new InstanceStaticVariables();
		System.out.println("Student name = "+(stud2.studname = "Nasreen"));
		System.out.println("Student age = "+(stud2.age = 23));
		System.out.println("Course = "+course);
		System.out.println();
		InstanceStaticVariables stud3 = new InstanceStaticVariables();
		System.out.println("Student name = "+(stud3.studname = "Anjali"));
		System.out.println("Student age = "+(stud3.age = 24));
		System.out.println("Course = "+course);
		System.out.println();
		InstanceStaticVariables stud4 = new InstanceStaticVariables();
		System.out.println("Student name = "+(stud4.studname = "Seethal"));
		System.out.println("Student age = "+(stud4.age = 23));
		System.out.println("Course = "+(course = "Automation testing"));


	}

}

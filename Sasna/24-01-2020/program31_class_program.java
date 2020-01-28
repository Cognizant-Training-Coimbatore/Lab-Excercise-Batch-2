class Student {
	String name;
	int roll_no;
	
 Student(int x, String y) {
	 roll_no = x;
	 name = y;
 }

void display() {
	System.out.println("roll_no : " +roll_no);
	System.out.println("name :" +name);
}
}
public class program31_class_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student(2, "John");
		obj.display();
		
	}

}

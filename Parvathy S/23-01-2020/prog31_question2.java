class details
{
	int rollno;
	String name;
}
public class prog31_question2 {

	public static void main(String[] args) {
		details obj1= new details();
		details obj2= new details();
		obj1.name ="Sam";
		obj1.rollno = 2;
		obj2.name ="John";
		obj2.rollno = 16;
		System.out.println("Details of student 1: "+"\nName: "+obj1.name+" "+"\nRoll no: "+obj1.rollno);
		System.out.println("Details of student 2: "+"\nName: "+obj2.name+" "+"\nRoll no: "+obj2.rollno);
	}

}

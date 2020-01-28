package demo;
class Student
{
	String name;
	int roll_No;
void display()
{
	System.out.println("Name : "+name);
	System.out.println("Roll No : "+roll_No);
	}
}
public class Question_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Student john=new Student();
		john.name="John Honay";
		john.roll_No=2;
		john.display();
		Student sam=new Student();
		sam.name="Sam Peter";
		sam.roll_No=3;
		sam.display();
	}

}

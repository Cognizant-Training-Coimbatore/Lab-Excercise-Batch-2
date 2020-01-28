class student
{
	String name;
	int rollno;
void display()
{
	System.out.println("Name=" +name);
	System.out.println("Rollno=" +rollno);
}
}
public class stud {

	public static void main(String[] args) {
		student ob=new student();
		ob.name="Jhon";
		ob.rollno=2;
		ob.display();
		
	}

}

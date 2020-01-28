class student
{
	String name;
	int rollno;
void display()
{
	System.out.println(name+","+rollno);
}
	
}
public class question1 {

	public static void main(String[] args)
	{
		student obj = new student();
		obj.name="john";
		obj.rollno=2;
		obj.display();
	}

}

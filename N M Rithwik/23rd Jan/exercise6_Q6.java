class student3
{
	String name;
	student3()
	{
		name = "Unknown";
	}
	student3(String a)
	{
		name = a;
	}
	void display()
	{
		System.out.println("name : " + name);
	}
}
public class exercise6_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student3 obj1 = new student3();
		student3 obj2 = new student3("Hazard");
		obj1.display();
		obj2.display();
	}

}

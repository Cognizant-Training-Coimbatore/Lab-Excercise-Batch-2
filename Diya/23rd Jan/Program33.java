class Student1
{
	int roll_no;
	String phone_no;
	String address;
	String name;

void display()
{
	System.out.println(name);
	System.out.println(roll_no);
	System.out.println(phone_no);
	System.out.println(address);
}
}
public class Program33 
{

	public static void main(String[] args) 
	{
		Student1 obj1 = new Student1();
		Student1 obj2 = new Student1();
		obj1.name = "Sam";
		obj1.roll_no=1;
		obj1.phone_no ="9496768926";
		obj1.address="abcdfg \nhgav \nhvgv";
		obj2.name = "John";
		obj2.roll_no=2;
		obj2.phone_no ="9496768925";
		obj2.address="abcdf \njnuj \nhbu";
		obj1.display();
		obj2.display();
		
		
	}

}


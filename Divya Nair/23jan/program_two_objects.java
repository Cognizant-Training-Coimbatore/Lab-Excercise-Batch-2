class student4
{
	int rollno, ph_no;
	String add,name;
	void display()
	{
		name="Sam";
		rollno=12;
		ph_no=1234;
		add="Usha Hostel";
		System.out.println("Name:"+name);
		System.out.println("Roll No:"+rollno);
		System.out.println("Phone no:"+ph_no);
		System.out.println("Address:"+add);
		
	}
	void display(String n,int r,int p,String a)
	{
		name=n;
		rollno=r;
		ph_no=p;
		add=a;
		System.out.println("\nName:"+name);
		System.out.println("Roll No:"+rollno);
		System.out.println("Phone no:"+ph_no);
		System.out.println("Address:"+add);
	}
	
}
public class program_two_objects {

	public static void main(String[] args)
	{
		student4 obj=new student4();
		obj.display();
		obj.display("John",13,5678,"padmavati hostel");

	}

}

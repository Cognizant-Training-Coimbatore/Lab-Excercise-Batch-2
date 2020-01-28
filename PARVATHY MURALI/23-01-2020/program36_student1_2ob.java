class Student1
{
	int rollno;
	long phn;
	String address;
	String name;
	Student1()
	{
		int roll=rollno;
		long ph=phn;
		String add=address;
		String nam=name;
	}
	void display()
	{
		System.out.println("Rollno: "+rollno+"   Student name: "+name+"     Address:"+address+"    Phone number:"+phn);
	}
}
public class program36_student1_2ob 
{

	public static void main(String[] args) 
	{
		String x,y;
		
		Student1 ob=new Student1();
		Student1 ob1=new Student1();
		ob.name="Sam";
		ob1.name="John";
		ob.rollno=2;
		ob1.rollno=3;
		ob.address="kochi";
		ob1.address="chennai";
		ob.phn=909999999;
		ob1.phn=888888882;
	
		
		ob.display();
		ob1.display();
	}

}

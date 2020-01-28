class member
{
	String name,add;
	int age,sal;
	float phno;
	void printsalary()
	{
		
	}
}
class Employee extends member
{
	String spec;
	void display()
	{
		System.out.println("name:"+name+"addres: "+add+"age: "+age+"sal: "+sal+"phno: "+phno);
	}
	
}
class Manager extends member
{
	String dep;
	void display()
	{
		
	
	 System.out.println("name:"+name+"addres: "+add+"age: "+age+"sal: "+sal+"phno: "+phno);
	}
}
public class qu3 {

	public static void main(String[] args) {
		Employee ob=new Employee();
		Manager ob1=new Manager();
		ob.name="arhem";
		ob.add="calicut";
		ob.age=45;
		ob.sal=56780;
		ob.phno=45677;
		ob1.name="arfhem";
		ob1.add="calficut";
		ob1.age=455;
		ob1.sal=546780;
		ob1.phno=45677;
		ob.display();
		ob1.display();
		
		

	}

}

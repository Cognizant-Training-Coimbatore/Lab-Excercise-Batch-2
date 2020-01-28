class student
{
	String name;
	int rollno;
	String Address;
	int Phonenumber;
	
	void display()
	{
		System.out.println(name);
		System.out.println(rollno);
		System.out.println(Address);
		System.out.println(Phonenumber);
	}
	
	
	
	}
public class prg32_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj1 = new student();
		student obj2 = new student();
		obj1.name="Sam";
		obj1.rollno=5;
		obj1.Address="pekat,coimbatore,pin:687678";
		obj1.Phonenumber=567576;
		obj2.name="John";
		obj2.rollno=8;
		obj2.Address="begdome,chennai,pin:757778;";
		obj2.Phonenumber=46777;
		
		
		obj1.display();
		obj2.display();
		
		

	}

}

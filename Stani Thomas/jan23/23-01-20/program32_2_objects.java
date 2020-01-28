class student1
{
	String name,adr;
	long rollno,ph;
	void display()
	{
		System.out.println("name : "+name);
		System.out.println("roll no : "+rollno);
		System.out.println("phone no : "+ph);
		System.out.println("address : "+adr);
	}
}
public class program32_2_objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
student1 obj1=new student1();
student1 obj2=new student1();
obj1.name="sam";
obj1.rollno=1;
obj1.ph=1234567890;
obj1.adr="house";
obj2.name="john";
obj2.rollno=2;
obj2.ph=1234567891;
obj2.adr="house";
obj1.display();
obj2.display();

	}

}

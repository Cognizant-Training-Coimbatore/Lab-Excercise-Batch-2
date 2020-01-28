class student1
{
	int rollno;
	int phno;
	String name,address;
	
}
public class question2 {

	public static void main(String[] args) 
	{
		student1 obj= new student1();
		student1 obj1= new student1();
		obj.rollno=1;
		obj.phno=98787873;
		obj.name="sam";
		obj1.rollno=2;
		obj1.phno=7637683;
		obj1.name="john";
		obj.address="sreevilasam house";
		obj1.address="kripa house";
		System.out.println("name: "+obj.name+" roll no: "+obj.rollno+"phone: "+obj.phno+"address: "+obj.address);
		System.out.println("name :"+obj1.name+"roll no :"+obj1.rollno+"phone: "+obj1.phno+"address: "+obj1.address);
	}

}

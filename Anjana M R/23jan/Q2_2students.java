class students
{
	String name,address;
	String phoneno;
	int rollno;
	
	void assign(String s,int a,String b,String c)
	{
		name=s;
		rollno=a;
		phoneno=b;
		address=c;
	}
	void display()
	{
		System.out.print("name        ="+name+'\n');
		System.out.print("roll no     ="+rollno+'\n');
		System.out.print("phonenumber ="+phoneno+'\n');
		System.out.print("Address     ="+address+'\n');
		
	}
}
public class Q2_2students {

	public static void main(String[] args) {
		students obj1=new students();
		students obj2=new students();
		obj1.assign("Sam",10,"9864356789","Sam House");
		obj2.assign("John",2,"9764367897","John house");
		obj1.display();
		obj2.display();
		
		

	}

}

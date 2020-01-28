class student1
{
	String name;
	int roll_no;
	int phn;
	String addrs;
	void assign(String n,int r,int p,String a)
	{
		name=n;
		roll_no=r;
		phn=p;
		addrs=a;
	}
	void display()
	{
		System.out.println(name+" "+ roll_no+" " +phn+ " "+ addrs);
		
	}
}
public class pgm35_two_objects_studentclass {

	public static void main(String[] args) {
		student1 obj1=new student1();
		student1 obj2=new student1();
		obj1.assign("Sam",1,245678,"kk house kannur");
		obj2.assign("John",2,77848,"ydjdhgg");
		obj1.display();
		obj2.display();
	}
}

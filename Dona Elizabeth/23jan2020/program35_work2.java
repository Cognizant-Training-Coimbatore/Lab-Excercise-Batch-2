class student1
{
	String name;
	long phoneno;
	String addr;
	void display(String n,long phn,String adr)
	{
		System.out.println(n);
		System.out.println(phn);
		System.out.println(adr);
	}
}

public class program35_work2 {

	public static void main(String[] args) {
		student1 obj1=new student1();
		obj1.display("Sam",9876543211,"sjdkjd");
		student1 obj2=new student1();
		obj2.display("John",9876543212,"jshsusyuds");
	}

}

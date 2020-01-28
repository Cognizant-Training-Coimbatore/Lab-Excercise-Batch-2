class student1
{
	String addr;
	int a;
	long phone;
}
public class prog35_2student_details 
{

	public static void main(String[] args)
	{
		student1 sam=new student1();
		student1 john=new student1();
		sam.addr="Royal palace";
		sam.a=2;
		sam.phone=9447474497L;
		john.addr="Blue ridge";
		john.a=3;
		john.phone=8301904497L;
		System.out.println("Address of sam: "+sam.addr);
		System.out.println("phone number of sam: "+sam.phone);
		System.out.println("Roll no of sam: "+sam.a);
		System.out.println("Address of John: "+john.addr);
		System.out.println("phone number of : "+john.phone);
		System.out.println("Roll no of : "+john.a);
	}

}

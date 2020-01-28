class parent
{
	void dis()
	{
System.out.println("this is a parent class");
}
}
class a2 extends parent
{
	void dis2()
	{
	System.out.println("This is a child class");	
}
}
public class Ass13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
parent ob=new parent();
ob.dis();
a2 ob1=new a2();
ob1.dis2();
ob1.dis();


	}

}

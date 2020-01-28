class x
{
	int a=20;
	
}
class y extends x
{
	int b=10;
	
}
class z extends y
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class prog61_mul_inheritance {

	public static void main(String[] args) {
		z obj=new z();
		obj.display();
		// TODO Auto-generated method stub

	}

}

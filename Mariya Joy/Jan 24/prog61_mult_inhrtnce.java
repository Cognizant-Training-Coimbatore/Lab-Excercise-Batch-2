class x
{
	int a=5;
}
class y extends x
{
	int b=5;
}
class z extends y
{
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class prog61_mult_inhrtnce {

	public static void main(String[] args) {
		z obj=new z();
		obj.display();
		// TODO Auto-generated method stub

	}

}

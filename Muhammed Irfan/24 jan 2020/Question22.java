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
public class Question22 {

	public static void main(String[] args) {
		z obj=new z();
		obj.display();
		// TODO Auto-generated method stub

	}

}

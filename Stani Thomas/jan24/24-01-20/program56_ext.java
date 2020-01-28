class as
{
	int a=10;
}
class bs extends as
{
	int b=10;
	int c=a+b;
	void display()
	{
		System.out.println(c);
	}
}
public class program56_ext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bs obj=new bs();
obj.display();
	}

}

class test1
{
	int a,b;
	void assign(int x,int y)// actually there is no need of this method instead we can create constructors to initialize the variables
	{
		a=x;
		b=y;
	}
	test1()
	{
		a=10;
		b=30;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
}

public class program30_constructors {

	public static void main(String[] args) {
		test1 obj=new test1();// upon creating this object for class test1, constructor is automatically invoked 
		obj.display();
	}

}

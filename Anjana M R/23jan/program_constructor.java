class test1{
	int a,b;
	void assign(int x,int y)
	{
		a=x;
		b=x;
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
public class program_constructor {

	public static void main(String[] args) {
		test1 obj=new test1();
		//obj.assign(10,10);
        obj.display();
        
	}

}

class test
{
	int x = 10;
	void assign(int p)
	{
		x = p;
	}
	void display()
	{
		System.out.println(x);
	}
}
public class program15_define_class 
{
    public static void main(String[] args) 
	{
    	test obj = new test();
    	obj.assign(10);
    	obj.display();
	}

}

class test
{
	int x;//variable
	void assign(int p) //method
	{
		x=p;
	}
	void display()
	{
		System.out.println(x);
	
	}
}
public class program25_define_class {

	public static void main(String[] args) {
		test obj = new test();
		obj.assign(10);
		obj.display();
		

	}

}

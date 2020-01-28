class test
{
	int x=10;
	void getdata(int p)
	{
		
		x=p;
	}
	void display() {
		System.out.println(x);
	}
}
public class example_class {

	public static void main(String[] args) {
		test obj=new test();
		obj.getdata(11);
		obj.display();

	}

}

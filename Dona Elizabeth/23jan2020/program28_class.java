class test
{
	int x=10;
	void assign(int p) // void means the function doesn't return any value
	{
		x=p;// x is a variable inside the class and p is an argument. p is available only in the method.
	}
	void display()
	{
		System.out.println(x); // p cannot be taken in this method but x can be.
	}
}

public class program28_class {

	public static void main(String[] args) {
		test obj=new test(); // object creation of the class test. without object, we cannot access the class test.
		obj.assign(5);
		obj.display();// calls the method display inside the test class.
		
	}

}

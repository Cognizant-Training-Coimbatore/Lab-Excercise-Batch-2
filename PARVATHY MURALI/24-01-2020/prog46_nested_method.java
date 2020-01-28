class sample45
{
	void display1()
	{
		System.out.println("display1 running");
		display2();
	}
	void display2()
	{
		System.out.println("display2 running");
	}
}
public class prog46_nested_method {

	public static void main(String[] args) {
		sample45 ob=new sample45();
				ob.display1();
				

	}

}

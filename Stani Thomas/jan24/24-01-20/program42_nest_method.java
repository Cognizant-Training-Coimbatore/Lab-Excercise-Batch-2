class sam5{
	void display1()
	{
		System.out.println("display1 is running");
		display2();
	}
	void display2()
	{
		
		System.out.println("display2 is running");
		
	}
	
}
public class program42_nest_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sam5 obj=new sam5();
obj.display1();

	}

}

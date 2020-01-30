class nest
{
	void display1() {
		System.out.println("display1");
	}
	
	void display2()
{
		System.out.println("display2");
		display1();}
}
public class program22_nesting_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		nest obj=new nest();
		//obj.display1();
		obj.display2();

	}

}

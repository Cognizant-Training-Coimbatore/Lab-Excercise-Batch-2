package demo;
class samplee
{
	void display1()
	{
		System.out.println("dispaly1.....");
		display2();
	}
	void display2()
	{
		System.out.println("dispaly2.....");
	}
}
public class program16_nesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samplee obj=new samplee();
		obj.display1();
		

	}

}

class sample5
{
	void display1()
	{
		System.out.println("display 1 running..");
		display2();
	}
	void display2()
	{
		System.out.println("display 2 running..");
	}
}
public class pgm25_nestng_mtds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample5 obj=new sample5();
		obj.display1();
		
	}

}

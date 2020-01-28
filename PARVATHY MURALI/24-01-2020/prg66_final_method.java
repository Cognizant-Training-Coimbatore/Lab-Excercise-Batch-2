class one
{
	final void disp()
	{
		System.out.println("display1 is working");
	}
}
class two extends one
{
	void disp()//since disp is final in one
	{
		System.out.println("display2 is working");
	}
}

public class prg66_final_method {

	public static void main(String[] args) {
		two ob=new two();
		ob.disp();

	}

}

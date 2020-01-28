class one
{
	final void display()
	{
		System.out.println("display1 is working");
	}
}
class two extends one
{
	void display() 
	{
		System.out.println("display2 working");
	}
}
public class pgm25_final_mtd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		two obj=new two();
		obj.display();

	}

}

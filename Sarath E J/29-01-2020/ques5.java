package sample;
class outterclass
{
	void display()
	{
		System.out.println("This is outter class");
	}
	 class innerclass
	 {
		 void display()
			{
				System.out.println("This is inner class");
			}
	 }
}
public class ques5 
{

	public static void main(String[] args) 
	{
		outterclass a = new outterclass();
		outterclass.innerclass  b = a.new innerclass();
		a.display();
		b.display();
		
		
	}

}

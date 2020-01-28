class shape
{
	void display()
	{
		System.out.println("This is shape");
		
	}
	
}
class rectangle extends shape
{
	void display1()
	{
	System.out.println("This is rectangle");
	}
}
class circle extends shape
{
	void print()
	{
		System.out.println("This is circle");
	}
}
class square extends rectangle
{
	void disp()
	{
		System.out.println("Square is rectangle");
	}
}
public class ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		square obj = new square();
		obj.disp();
		obj.display();
		obj.display1();
	}

}

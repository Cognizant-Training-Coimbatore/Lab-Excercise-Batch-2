package demo;
class shape
{
	void display1()
	{
		System.out.println("this is shape");
	}
}
class circle extends shape
{
	void display2()
	{
		System.out.println("this is circular shape");
	}
}
class rectangle extends shape
{
	void display3() 
	{
	System.out.println("this is rectangular in shape");	
	}
}
class square extends rectangle
{
void display4()
{
	System.out.println("square is arectangle");
}
}
public class q25_shapee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
square obj=new square();
obj.display1();
obj.display3();
	}

}

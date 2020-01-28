class shape
{
	void dis()
	{
		System.out.println("This is shape");
	}
}
class rectangle extends shape
{
	void dis1()
	{
		System.out.println("This is rectangular shape");
	}
}
class circle extends shape
{
	void dis2()
	{
		System.out.println("This is circular shape");
	}
}
class square extends rectangle
{
	void dis3()
	{
		System.out.println("square is a rectangle");
	}
}
public class Qno_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square obj=new square();
		obj.dis();
		obj.dis1();
	}

}

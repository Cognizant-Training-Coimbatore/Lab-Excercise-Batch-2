package demo;

class consover
{
	consover()
	{
		System.out.println("default");
		
	}
	consover(int x,int y)
	{
		System.out.println("int constructor");
	}
}

public class program_20_consoverloading {

	public static void main(String[] args) {
		
     consover obj=new consover();
     consover obj1=new consover(10,20);
		
	}

}

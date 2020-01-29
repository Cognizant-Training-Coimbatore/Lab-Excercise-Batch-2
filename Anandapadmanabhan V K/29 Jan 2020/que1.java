interface printable
{
	public void display(); 
	int area=224;
	String car="Ferrari";
	String dept="HR";
	
	}
	class rectangle implements printable
	{
	public void display () 
	{
	System.out.println(area);
	}
	}
	class sportscar implements printable
	{
		public void display()
		{
	System.out.println(car);
	 }
	}
	class manager implements printable
	{
	public void display () 
	{
	System.out.println(dept);
	}
	}
public class que1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			rectangle obj1=new rectangle();
			obj1.display();
			sportscar obj2=new sportscar();
			obj2.display();
			manager obj3=new manager();
			obj3.display();
	}

}

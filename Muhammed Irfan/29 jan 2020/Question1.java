package demo_29_01_2020;
interface printable
{
   void display();	
}
class rectangle implements printable
{
  public void display()
  {
	 System.out.println("rectangle"); 
  }
}
class sportscar implements printable
{
  public void display()
  {
	 System.out.println("sportscar"); 
  }
}
class manager implements printable
{
  public void display()
  {
	 System.out.println("manager"); 
  }
}
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle obj1=new rectangle();
		sportscar obj2=new sportscar();
		manager obj3=new manager();
		obj1.display();
		obj2.display();
		obj3.display();
	}

}

package demo_29_01_2020;
interface print
{
   void display1();
   void display2();
}
class rectangle implements print
{
  public void display1()
  {
	 System.out.println("rectangle1"); 
  }
  public void display2()
  {
	 System.out.println("rectangle2"); 
  }
}
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		rectangle obj=new rectangle();
		obj.display1();
		obj.display2();
	}

}

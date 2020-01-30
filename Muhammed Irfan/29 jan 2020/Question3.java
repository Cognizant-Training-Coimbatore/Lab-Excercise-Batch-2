package demo_29_01_2020;
interface b
{
void display();

}
class c
{
void display1()
{
	System.out.println("inside the class c.....");
}
}
class irfan extends c implements b
{
  public void display()
  {
	  
	  System.out.println("inside interface");
  }
}
public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		irfan obj= new irfan();
		obj.display();
		obj.display1();
		
	}

}

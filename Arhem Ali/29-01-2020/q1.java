package newjava;
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
public class q1 {

	public static void main(String[] args) {
		rectangle n1=new rectangle();
		n1.display();
		sportscar n2=new sportscar();
		n2.display();
		manager n3=new manager();
		n3.display();
		
		

	}

}

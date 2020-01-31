package pack;


interface printableinterface
{
	void display();
}

class rectangle implements printableinterface
{
	public void display()
	{
		System.out.println("Rectangle");
	}
}
class sportcar implements printableinterface
{
	public void display()
	{
		System.out.println("Sportcar");
	
	}
}
class manager implements printableinterface 

{
	public void display()
	{
		System.out.println("Manager");
	
	}
}
public class inter_something 
{


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle obj1=new rectangle();
		obj1.display();
		sportcar obj2=new sportcar();
		obj2.display();
		manager obj3=new manager();
		obj3.display();
		
		

	}

}


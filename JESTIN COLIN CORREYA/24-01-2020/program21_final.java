package demo;
class one
{
 void display() 
	{
		System.out.println("display 1");
	}
}
class two extends one
{
	void display()
	{
		System.out.println("display 2");
	}
}
public class program21_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two obj=new two();
obj.display();

	}

}

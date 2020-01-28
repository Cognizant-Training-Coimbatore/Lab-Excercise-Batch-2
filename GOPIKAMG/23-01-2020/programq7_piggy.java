class Addamount
{
	int amount=50;
	Addamount()
	{
		
	}
	Addamount(int a)
	{
		amount=amount+a;
	}
	void display()
	{
		System.out.println(amount);
	}
}
public class programq7_piggy {

	public static void main(String[] args) 
	{
		Addamount obj=new Addamount();
		Addamount obj1=new Addamount(34);
		obj.display();
		obj1.display();

	}

}

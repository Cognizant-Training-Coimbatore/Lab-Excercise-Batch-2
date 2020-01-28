class samplee4
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class static_variable {

	public static void main(String[] args) 
	{
		samplee4 obj1=new samplee4();
		obj1.display();
		samplee4 obj2=new samplee4();
		obj2.display();

	}

}

class sample3
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class program_static_variable {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		sample3 obj1=new sample3();
		obj1.display();
		sample3 obj2=new sample3();
		obj2.display();
		

	}

}

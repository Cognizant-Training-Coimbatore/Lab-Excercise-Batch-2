package demo;

class a
{
	int i;
	void display()
	{	
		i++;
		System.out.println(i);
	
	}
}

public class program23_static
{

	public static void main(String[] args)
	{
		 a ob1=new a();
		 ob1.display();
		 a ob2=new a();
		 ob2.display();

	}

}

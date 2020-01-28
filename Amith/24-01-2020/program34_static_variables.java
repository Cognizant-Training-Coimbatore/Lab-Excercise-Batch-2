class sample4
{
	static int i;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class program34_static_variables {

	public static void main(String[] args) 
	{
		sample4 obj1=new sample4();
		sample4 obj2= new sample4();
		obj1.display();
		obj2.display();
		
	}

}

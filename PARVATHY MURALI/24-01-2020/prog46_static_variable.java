class sample4
{
	static int i=0;
	void display()
	{
		i++;
		System.out.println(i);
	}
}
public class prog46_static_variable 
{
	
	public static void main(String[] args) 
	{
	sample4 ob=new sample4();
		ob.display();
		sample4 obj=new sample4();
		obj.display();
			
		

	}

}

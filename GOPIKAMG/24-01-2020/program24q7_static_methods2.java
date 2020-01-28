class increment
{
	static int count=100;
	static void display(int i)
	{
		count++;
		System.out.println(count);
	}
}
public class program24q7_static_methods2 {

	public static void main(String[] args)
	{
	increment obj=new increment();
	System.out.println(obj.count);
	obj.display(10);

	}

}

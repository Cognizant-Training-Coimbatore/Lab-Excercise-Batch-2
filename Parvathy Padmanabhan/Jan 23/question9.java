class printint
{
	void display(int a, String b)
	{
		System.out.println(a + b);
	}
	void display(String b, int a)
	{
		System.out.println(b+a);
	}
}
public class question9 {
	public static void main(String args[])
	{
		printint obj= new printint();
		obj.display(2, "Hi");
		obj.display("Hi",2);	
	}

}

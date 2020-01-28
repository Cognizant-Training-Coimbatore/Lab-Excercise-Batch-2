class integer
{
	int a;
	char b;
	void display(int x,char y)
	{
		a=x;
		b=y;
		System.out.println(a);
		System.out.println(b);
	}
	void display(char x,int y) 
	{
		b=x;
		a=y;
		System.out.println(a);
		System.out.println(b);
	}
}
public class program_sequence {

	public static void main(String[] args)
	{
		
		integer obj=new integer();
		obj.display(12,'a');
		obj.display('b', 10);
		
	}

}

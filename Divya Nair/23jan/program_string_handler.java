import java.util.Scanner;

class handle
{
	String str;
	int len;
	void display()
	{
		str="Divya";
		int len=str.length();
		System.out.println("String:"+str);
		System.out.println("length:"+len);
		
		
	}
	void display(String s)
	{
		str=s;
		System.out.println("String:"+str);
		
	}
	void show()
	{
	
		System.out.println(str.toUpperCase());
	}
}
public class program_string_handler {

	public static void main(String[] args)
	{
		handle obj=new handle();
		obj.display();
		obj.display("Java");
		obj.show();

	}

}

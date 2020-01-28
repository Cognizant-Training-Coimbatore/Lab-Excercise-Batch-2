class string_handler
{
	String str;
	int len;
	void display()
	{ 
		str="Mariya";
		len=str.length();
		System.out.println("the string is "+str);
		System.out.println("the length of string is "+len);
	}
	void display(String s)
	{
		str=s;	
		System.out.println("String is: "+str);
		System.out.println(str.toUpperCase());
	}
}
public class prog42_strng_handlr {

	public static void main(String[] args) 
	{
		string_handler obj=new string_handler();
		obj.display();
		obj.display("Java");
		
	}
		
}
	

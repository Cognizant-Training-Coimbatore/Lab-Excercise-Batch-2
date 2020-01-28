class stringhandler
{
	String str;
	int len;
	void display()
	{
		str="Betty";
		len=str.length();
		System.out.println("the string is " +str);
		System.out.println("length of string is " +len);
		
	}
	void display(String s)
	{
		str=s;
		System.out.println("string is " +str);
		System.out.println(str.toUpperCase());
		
	}
	
}
public class prog42_string_handler {

	public static void main(String[] args) {
		stringhandler obj=new stringhandler();
		obj.display();
		obj.display("Java");
				
				
				
				
				
		// TODO Auto-generated method stub

	}

}

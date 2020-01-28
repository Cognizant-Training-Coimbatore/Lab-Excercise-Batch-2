


public class program_boxing 
{
	public static void main(String[] args)
	{  
		System.out.println("Boxing and Unboxing");
		int x=100;
		Integer obj;
		obj=x;	//boxing integer variable is assigned to an integer object. auto boxing
		System.out.println(obj.compareTo(100));
		int y=obj;	//unboxing
		System.out.println(y);
		System.out.println(Integer.parseInt("123"+2));
	}
}

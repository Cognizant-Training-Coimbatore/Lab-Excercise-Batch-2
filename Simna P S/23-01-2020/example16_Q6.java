import java.util.Scanner;

class stringhandler
{
	
	void lower(String a)
	{
	
        System.out.println(a.toLowerCase()); 
	}
	void lenght(String a)
	{
		int len = a.length();
		
		System.out.println("Length of the string is: "+ len );
	}
}
public class example16_Q6 
{

	public static void main(String[] args) 
	{
		String gg;
		stringhandler obj = new stringhandler();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		gg= scanner.next();
		obj.lower(gg);
		obj.lenght(gg);

	}

}

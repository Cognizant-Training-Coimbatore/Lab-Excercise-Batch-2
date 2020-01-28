import java.util.Scanner;

public class example5_string 
{

	public static void main(String[] args) 
	{
		
		String mystr;
		int len;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the text: ");
    	mystr = input.next();
    	len = mystr.length();
        System.out.println("Length of a String is : " + len);

	}

}

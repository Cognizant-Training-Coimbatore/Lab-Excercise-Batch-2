import java.util.Scanner;

public class example10_strore_your_name 
{

	public static void main(String[] args) 
	{
		String mystr;
		int len;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Name: ");
    	mystr = input.next();
    	System.out.println(mystr.toUpperCase());
    	len = mystr.length();
        System.out.println("Length of a String is : " + len);
        

	}

}

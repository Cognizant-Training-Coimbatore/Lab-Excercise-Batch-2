import java.util.Scanner;

public class question7_reverse_of_string {

	public static void main(String[] args) 
	{
		String original,reverse="";
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the string to reverse:");
		original=sc.nextLine();
		
		int length = original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		System.out.println("Reverse of the string:" +reverse);
	}

}

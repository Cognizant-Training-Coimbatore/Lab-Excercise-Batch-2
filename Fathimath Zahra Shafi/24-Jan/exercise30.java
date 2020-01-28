import java.util.Arrays;
import java.util.Scanner;

public class exercise30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str;
		String rev="";
		
		System.out.println("enter a string");
		Scanner scanner=new Scanner(System.in);
		str=scanner.nextLine();
		int n=str.length();
		
		
		for(int i=n-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}

		
		System.out.println("reversed string: " +rev);
		
	}

}

import java.util.Scanner;

public class que7 {

	public static void main(String[] args) {
		String str,s=" ";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.nextLine();
		int b=str.length();
		for( int i=b-1;i>=0;i--)
		{
			s=s+str.charAt(i);
		}
		System.out.println("reverse: "+s);	
		
		

	}

}

import java.util.Scanner;

public class que10 {

	public static void main(String[] args) {
		String str,s="";
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter string");
		str=sc.nextLine();
		int b=str.length()-1;
		int i=0,count=0;
		while(i<b)
		{
			if(str.charAt(i)!=str.charAt(b))
			{
				 count=2;
			}
			else
			{
				 count=1;
			
			}
			i++;
			b--;
		}
		if(count==2)
		{
			System.out.println("Not palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}
		
	   
	}

}

import java.util.Scanner;

public class program24q10_pallindrome {

	public static void main(String[] args)
	{
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		String reverse="";
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
     if(str.equals(reverse))
      {
	System.out.println(str +"is pallindrome" );
      }
     else
     {
    	 System.out.println(str +"is not pallindrome");
     }
	}

}

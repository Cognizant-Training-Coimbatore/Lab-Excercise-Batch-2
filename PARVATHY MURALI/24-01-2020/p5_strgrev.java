import java.util.Scanner;

public class p5_strgrev 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter string: ");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int l=str.length();
		String strg="";
		for(int i=(l-1);i>=0;i--)
		{	
			strg=strg+str.charAt(i);
			
			
		}System.out.println("reverse string:"+strg);
		 
	}

}

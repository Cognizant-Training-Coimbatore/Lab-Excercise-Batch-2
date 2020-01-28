import java.util.Scanner;

public class p57_strpallin 
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
		}
		if(str.equals(strg))
		{
			System.out.println(str+" is pallindrom");
		}
		else
		{
			System.out.println(str+" is not pallindrom");
		}

	}

}

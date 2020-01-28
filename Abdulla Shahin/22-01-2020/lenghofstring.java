import java.util.Scanner;
public class lenghofstring {

	public static void main(String[] args)
	{
		int count=0;
		System.out.println("enter the string:");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
			 count=count+1;
		}
		System.out.println(count);
	}

}

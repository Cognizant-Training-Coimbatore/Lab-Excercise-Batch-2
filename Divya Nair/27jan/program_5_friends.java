import java.util.Scanner;

public class program_5_friends {

	public static void main(String[] args) 
	{
		
		int n;
		System.out.println("Enter the size of the array");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		String[] s=new String[n];
		int len=s.length;
		
		for(int i=0;i<len;i++)
		{
			s[i]=scan.nextLine();
			System.out.println(s[i]);
		}
		
		

	}

}

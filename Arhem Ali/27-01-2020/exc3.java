import java.util.Scanner;

public class exc3 {
	

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:  ");
		String s=sc.nextLine();
		int n=s.length();
		int i=0,c=0;
		
		while(i<n)
		{
			
			if(s.charAt(i)!=' ')
			{
				c=c+1;
			}
			i=i+1;	
		}
		System.out.println("no of characters: "+c);
		if(c==0)
			throw new NullPointerException("empty string");
		
	}

}

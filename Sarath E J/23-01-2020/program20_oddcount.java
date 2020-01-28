import java.util.Scanner;

public class program20_oddcount {

	public static void main(String[] args) 
	{
		int a,b,c,d,e,count =0;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		d=sc.nextInt();
		e=sc.nextInt();
		
		if(a%2!=0)
		{
			count++;
		}
		if(b%2!=0)
		{
			count++;
		}
		
		
		if(c%2!=0)
		{
			count++;
		}
		
		if(d%2!=0)
		{
			count++;
		}
		
		if(e%2!=0)
		{
			count++;
		}
		
		
		
		
		System.out.println("The count is "+count);
	}

}

import java.util.Scanner;

public class prog22_find_odd {

	public static void main(String[] args)
	{
		int i,a,count=0;
		Scanner scanner=new Scanner(System.in);
		
		for(i=1;i<6;i++)
			
		{
			System.out.println("enter number "+i);
			a=scanner.nextInt();
			if(a%2!=0)
			{
				count++;
			}
			
		}
		System.out.println("Number of odd numbers="+count);
		
		// TODO Auto-generated method stub

	}

}

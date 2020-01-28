import java.util.Scanner;

public class p51_numberlist 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the lower bound:");
		int l=sc.nextInt();
		System.out.println("Enter the upper bound:");
		int h=sc.nextInt();
		System.out.println("The numbers between "+l+" and "+h+"is:");
		for(int i=l+1;i<h;i++) 
		{
			System.out.println(i);
		}
		
		

	}

}

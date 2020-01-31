import java.util.Scanner;

public class p19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[10];
		int flag=0;
		System.out.println("Enter the numbers");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be searched");
		int x=sc.nextInt();
		for(int i=0;i<5;i++)
		{
			if(a[i]==x)
			{	
				flag=1;
				System.out.println("The element is present");
				
			}
		}
			if(flag==0)
			{
				System.out.println("not present");
			}
		}
	}



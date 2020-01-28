import java.util.Scanner;

public class qs8 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		int ar[]=new int[5];
		int a[]=new int[5];
		int temp;
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value"+(i+1));
			int b=sc.nextInt();
			ar[i]=b;
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				
				if(ar[j+1]<ar[j])
				{
					temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
					
			}
		}
		System.out.println("ASCENDING ORDER:  ");
		for(int i=0;i<5;i++)
		{
			System.out.println(ar[i]);
		}
		int j=4;
		for(int i=0;i<5;i++)
		{
			a[j]=ar[i];
			j=j-1;
		}
		System.out.println("DESCE OREDR: ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
			
		
	}

}

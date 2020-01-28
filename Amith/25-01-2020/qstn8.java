import java.util.Scanner;

public class qstn8 
{

	public static void main(String[] args) 
	{
		int ar1[]=new int[5];
		System.out.println("enter the numbers");
		Scanner sc =new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			ar1[i]=sc.nextInt();
		}
		int ar2[]=new int[5];
		ar2=ar1;
		for(int  j=1;j<6;j++)
		{
			for(int i=0;i<4;i++)
			{
			if(ar2[i]>ar2[i+1])
			{
				int k=ar2[i];
				ar2[i]=ar2[i+1];
				ar2[i+1]=k;
			}
			}
		}
		System.out.print("ascending order");
		for(int i=0;i<5;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		for(int j=0;j<6;j++)
		{
			for(int i=0;i<4;i++)
			{
			if(ar1[i]<ar1[i+1])
			{
				int p=ar1[i];
				ar1[i]=ar1[i+1];
				ar1[i+1]=p;
			}
			}
		}
		System.out.print("descending order");
		for(int i=0;i<5;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		
		

	}

}

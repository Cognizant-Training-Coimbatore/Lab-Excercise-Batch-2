import java.util.Scanner;

public class ex_q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		
		int i,j,t;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for( i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		
		for(i=0;i<4;i++)
		{
			for(j=0;j<4-i;j++)
			{
				if(a[j]>a[j+1])
				{
					t=a[j];
					a[j]=a[j+1];
					a[j+1]=t;
				}
			}
		}
		System.out.println("array in ascending order: ");
		for(i=0;i<5;i++)
		{
		
			System.out.println(a[i]);
		
		}
		
	
		System.out.println("array in descending order: ");
		for(i=4;i>=0;i--)
		{
		
			System.out.println(a[i]);
		
		}
		
	}

}

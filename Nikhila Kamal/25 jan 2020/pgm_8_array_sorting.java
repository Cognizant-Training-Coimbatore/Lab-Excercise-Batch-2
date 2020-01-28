import java.util.Scanner;

public class pgm_8_array_sorting {

	public static void main(String[] args) {
		
		
		int n[]=new int[5];
		
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			
			n[i]=sc.nextInt();
			
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(n[i]>n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
					
				}
						
		}
	}
		System.out.println("ascending order:");
		for(int i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(n[i]<n[j])
				{
					int temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				}
			}
		}
		System.out.println("descending order:");
		for(int i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
}
}

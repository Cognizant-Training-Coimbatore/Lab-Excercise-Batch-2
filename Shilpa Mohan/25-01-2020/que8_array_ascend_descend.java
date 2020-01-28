import java.util.Scanner;

public class que8_array_ascend_descend {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i;
		int j;
		int temp;
		int num[] = new int[5];
		System.out.println("Enter the numbers in array:");
		for(i=0;i<=4;i++)
		{
			num[i] = sc.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;							
				}
			}
		}
		System.out.println("Array elements in the ascending order:");
		for(i=0;i<=4;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Array elements in the descending order:");
		for(i=4;i>=0;i--)
		{
			System.out.println(num[i]);
		}
		
	}

}

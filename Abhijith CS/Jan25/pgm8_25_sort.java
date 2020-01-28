import java.util.Scanner;

public class pgm8_25_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int i,j,a;
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i+1;j<5;j++)
			{
				if(num[j]<num[i])
				{
					a=num[i];
					num[i]=num[j];
					num[j]=a;
				}
			}
		}
		System.out.println("Ascending order....");
		for(i=0;i<5;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("Descending order....");
		for(i=4;i>=0;i--)
		{
			System.out.println(num[i]);
		}
	}

}

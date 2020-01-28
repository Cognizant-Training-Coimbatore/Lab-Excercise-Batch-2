import java.util.Scanner;

public class exercise25_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int i,j,temp;
		System.out.println("Enter 5 number :");
		for(i=0;i<5;i++)
		{
			num[i] = sc.nextInt();
		}
		for(i=0;i<5;i++)
		{
			for(j=i;j<4;j++)
			{
				if(num[j]>num[j+1])
				{
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		System.out.println("Ascending order : ");
		for(i=0;i<5;i++)
		{
			System.out.print(num[i] + "  ");
		}
		System.out.println("Descending order : ");
		for(i=4;i>=0;i--)
		{
			System.out.print(num[i] + "  ");
		}
	}

}

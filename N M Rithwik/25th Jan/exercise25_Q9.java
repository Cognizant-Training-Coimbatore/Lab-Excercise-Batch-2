import java.util.Scanner;

public class exercise25_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[10];
		Scanner sc = new Scanner(System.in);
		int i, j, flag=0;
		System.out.println("Enter 10 numbers :");
		for(i=0;i<10;i++)
		{
			num[i] = sc.nextInt();
		}
		System.out.println("Enter the number to be searched");
		j = sc.nextInt();
		for(i=0;i<10;i++)
		{
			if(num[i]==j)
			{
				flag=1;
				j=i;
			}
		}
		if(flag==0)
			System.out.println("the number is not present");
		else
			System.out.println("The given is present at index : " + (j));
	}

}

import java.util.Scanner;

public class q_9 {

	public static void main(String[] args)
	{
		int flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value to be searched:");
		int search = sc.nextInt();
		int arr[] = new int[] {5,2,8,7,1,32,43,41,21,100};
		for(int i=0;i<10;i++)
		{
			if(arr[i] == search)
			{
				System.out.println("element found");
				flag=1;
				break;
			}
		}
		if(flag == 0 )
		{
			System.out.println("not found");
		}
		
	}

}

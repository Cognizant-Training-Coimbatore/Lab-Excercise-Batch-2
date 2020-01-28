import java.util.Scanner;

public class q_6 {

	public static void main(String[] args) 
	{
		int n,sum=0;float avg=0;
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("enter 5 nos:");
		for(int i=0;i<5;i++)
		{
			n = sc.nextInt();
			arr[i] = n;
		}
		sum = arr[0] + arr[1] + arr[2] + arr[3] + arr[4];
		avg = sum/5;
		System.out.println(sum);
		System.out.println(avg);
	}

}

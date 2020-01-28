import java.util.Scanner;

public class qs7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int ar[]=new int[5];
		System.out.println("Enter 5 values ");
		for(int i=0;i<5;i++)
		{
			System.out.println("Values: ");
			int b=sc.nextInt();
			arr[i]=b;
			ar[i]=arr[i];
			
		}
		System.out.println("Values are");
		for(int j=0;j<5;j++)
		{
			System.out.println(ar[j]);
		}

	}

}

import java.util.Arrays;
import java.util.Scanner;


public class program8_lab8 {

	public static void main(String[] args) {
		int i;
		int arr[]=new int[5];
		//int asc[]=new int[5];
		int desc[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers");
		for(i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Array in ascending order: ");
		for(i=0;i<5;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println("\nArray in desc:");
		int j=0;
		int k=4;
		while(j<5)
		{
			desc[j]=arr[k];
			k--;
			j++;
		}
		for(i=0;i<5;i++)
		{
			System.out.print(desc[i]);
		}
		
	}

}

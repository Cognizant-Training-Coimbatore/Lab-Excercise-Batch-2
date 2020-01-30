import java.util.Scanner;

public class Program50 {

	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers");
		for(int i = 0; i <10;i++)
		{
		a[i]=sc.nextInt();
		}
		int max = a[0];
		for(int i = 1; i <10;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("Maximum : "+max);
		int min = a[0];
		for(int i = 1; i <10;i++)
		{
			if(a[i] < min)
			{
				min = a[i];
			}
		}
		System.out.println("Minimum : "+min);
		int total = 0;
		for(int i = 0; i <10;i++)
		{
			total = total+a[i];
		}
		int avg = total/10;
		System.out.println("Average : "+avg);
	}

}

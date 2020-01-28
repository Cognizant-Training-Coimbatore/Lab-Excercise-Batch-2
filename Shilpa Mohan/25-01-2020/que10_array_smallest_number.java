import java.util.Scanner;
public class que10_array_smallest_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int j=0;
		int temp=0;
		int numbers[] = new int[5];
		System.out.println("Enter the numbers in the array:");
		for(i=0;i<=4;i++)
		{
			numbers[i] = sc.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			for(j=i+1;j<=4;j++)
			{
				if(numbers[i]<numbers[j])
				{
					temp=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=temp;
				}
			}
		}
		System.out.println("The smallest number in the array is " +temp);

	}

}

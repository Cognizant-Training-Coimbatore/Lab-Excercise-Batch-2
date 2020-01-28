import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
class ten_numbers
{
	int min;
	int max;
	int avg;
	int total=0;
	Integer[] numbers =new Integer[10];
	void display()
	{
		for(int i=0;i<numbers.length;i++)
		{
			total+=numbers[i];
		}
		int min = Collections.min(Arrays.asList(numbers)); 
		int max = Collections.max(Arrays.asList(numbers));
		double avg = total/numbers.length;
		System.out.println("Minimum number of array is : " + min); 
        System.out.println("Maximum number of array is : " + max);
		System.out.println("Average of the numbers is :" +avg);
	}
}
public class question3_max_min_avg {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		ten_numbers obj = new ten_numbers();
		System.out.print("enter 10 numbers:");
		for (int i=0;i<obj.numbers.length;i++)
		{
           obj.numbers[i]=sc.nextInt();
		}
		obj.display();
	}

}

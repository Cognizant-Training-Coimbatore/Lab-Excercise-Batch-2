//9.	Write a Java program to compute the sum of the first 100 prime numbers.
package packone;

public class p9_sum_of_100 {

	public static void main(String[] args) {
		int sum=0;
		System.out.println("Sum of numbers from 1 to 100: ");
		for(int i=1;i<=100;i++)
		{
			if((i/2)%2!=0 && i!=2)
			{
				sum=sum+i;
			}
		}System.out.println(sum);

	}

}

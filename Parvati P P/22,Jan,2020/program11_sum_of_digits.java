import java.util.Scanner;
public class program11_sum_of_digits {

	public static void main(String[] args) {
		int num,sum=0,rem=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no..");
		num=sc.nextInt();
		
		while(num!=0) {
		rem=num%10;
		sum=sum+rem;
		num=num/10;}
		System.out.println("Sum of elements is..."+sum);
	}

}

import java.util.Scanner;
public class program6_sum_average {

	public static void main(String[] args) {
		int i,avg=0,count=0,sum=0;
		int num[] = new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the count of nos.");
		count=sc.nextInt();
		System.out.println("Enter the nos.");
		for(i=0;i<count;i++) {
			num[i]=sc.nextInt();
	}
		for(i=0;i<count;i++) {
			sum=sum+num[i];
	}
		System.out.println("The sum is.. "+sum);	
		avg=sum/count;
		System.out.println("The average is.. "+avg);
}}

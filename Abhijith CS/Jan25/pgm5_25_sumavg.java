import java.util.Scanner;

public class pgm5_25_sumavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		int sum=0;
		float avg;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int i;
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
			sum=sum+num[i];
		}
		avg=sum/5;
		System.out.println("The sum : "+sum);
		System.out.println("The average : "+avg);
		sc.close();
	}

}

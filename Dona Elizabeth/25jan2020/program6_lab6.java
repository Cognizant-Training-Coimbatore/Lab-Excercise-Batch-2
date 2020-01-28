import java.util.Scanner;

public class program6_lab6 {

	public static void main(String[] args) {
		int i,sum,avg;
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Input 5 numbers");
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		sum=num[0]+num[1]+num[2]+num[3]+num[4];
		avg=sum/5;
		System.out.println("Sum : "+sum);
		System.out.println("Average : "+avg);

	}

}

import java.util.Scanner;

public class qstn__06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		int ar[]=new int[5];
		int sum=0,avg;
		for(int i=0;i<5;i++)
		{
			ar[i]=sc.nextInt();
			sum+=ar[i];
		}
		System.out.println("Sum\t:\t"+sum);
		System.out.println("Avg"+ "\t:\t"+sum/5);
	}

}

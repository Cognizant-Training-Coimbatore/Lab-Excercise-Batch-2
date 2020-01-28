import java.util.Scanner;

public class exercise25_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		Scanner sc = new Scanner(System.in);
		int i,sum=0;
		System.out.println("Enter 5 number :");
		for(i=0;i<5;i++)
		{
			num[i] = sc.nextInt();
			sum=sum+num[i];
		}
		System.out.println("Sum : " + sum);
		System.out.println("Sum : " + sum/5);
		
	}

}

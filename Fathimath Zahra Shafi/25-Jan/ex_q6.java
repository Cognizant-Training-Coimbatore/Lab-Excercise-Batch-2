import java.util.Scanner;

public class ex_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]=new int[5];
		int sum=0;
		float avg=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
			sum+=a[i];
	}
		avg=sum/5;
		System.out.println("sum: " +sum);
		System.out.println("average: " +avg);

}
}
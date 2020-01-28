import java.util.Scanner;

public class prog_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum,average;
		int a[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 nos:");
		for(i=0;i<5;i++)
		{
			a[i] = sc.nextInt();
		}
		sum = a[0]+a[1]+a[2]+a[3]+a[4];
		average= sum/5;
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+average);

	}

}

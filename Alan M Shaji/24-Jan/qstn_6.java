import java.util.Scanner;

public class qstn_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,avg,a,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers...");
		while((a=sc.nextInt())!=-999)
		{
			sum+=a;
			i++;
		}
		System.out.println("Sum \t:\t"+sum);
		System.out.println("Avg \t:\t"+sum/i);
		sc.close();
	}

}

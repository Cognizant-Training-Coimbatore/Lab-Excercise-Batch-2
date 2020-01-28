import java.util.Scanner;

public class prog74_arraynmbr_from_user {

	public static void main(String[] args) {
		int i,sum=0;
		float avg;
		int num[]=new int[5];
		Scanner s=new Scanner(System.in);
	
		for(i=0;i<5;i++)
		{
			System.out.println("Enter number "+i);
			num[i]=s.nextInt();
			sum=sum+num[i];
		}
		avg=sum/5;
		System.out.println("Sum= "+sum);
		System.out.println("Average= "+avg);
			
		// TODO Auto-generated method stub

	}

}

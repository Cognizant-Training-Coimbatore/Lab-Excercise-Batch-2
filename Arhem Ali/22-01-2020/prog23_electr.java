import java.util.Scanner;

public class prog23_electr {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter new meter reading");
		int a=sc.nextInt();
		System.out.println("Enter old reading: ");
		int b=sc.nextInt();
		int c=a-b;
		int p=0;
		if(c>1 && c<100)
		{
			System.out.println("free");
		}
		else if(c>100 && c<200)
		{
			p=c*1;
		}
		else if(c>200 && c<300)
		{
			p=c*2;
		
		}
		else if(c>300 && c<400)
		{
			p=c*3;
		}
		else
		{
			int k=(c*4);
			p=k+(k/10);
		}
		
		System.out.println("price = "+p);
	}

}

import java.util.Scanner;

class nums
{
	int sum=0,count=0;
	double avg=0;
	void calc(int num)
	{
		count++;
		sum=sum+num;
		avg=sum/count;
	}
}
public class pgm51_nnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nums obj = new nums();
		Scanner sc = new Scanner(System.in);
		int a=0;
		System.out.println("Enter number : (enter 999 to exit)");
		while(a!=999)
		{
			a= sc.nextInt();
			if (a!=999)
			{
				obj.calc(a);
			}
		}
		System.out.println("Sum of numbers entered is: "+obj.sum);
		System.out.println("average of numbers entered is: "+obj.avg);	
	}

}

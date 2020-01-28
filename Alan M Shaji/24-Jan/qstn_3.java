import java.util.Scanner;

public class qstn_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum,min,max;
		double avg;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter 10 integers\t:\t");
		min=max=sum=sc.nextInt();
		for(int i=0;i<9;i++)
		{
			int a=sc.nextInt();
			sum+=a;
			if(max<a)
				max=a;
			if(min>a)
				min=a;
		}
		avg=sum/10;
		System.out.println("Avg\t:\t"+avg);
		System.out.println("Min\t:\t"+min);
		System.out.println("Max\t:\t"+max);
	}

}

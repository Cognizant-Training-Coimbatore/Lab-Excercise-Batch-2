import java.util.Scanner;

public class exercise13_Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,max,min,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 10 intergers : ");
		a = sc.nextInt();
		max = a;
		min = a;
		sum = sum + a;
		for(i=0;i<9;i++)
		{
			a = sc.nextInt();
			if(a>max)
				max=a;
			if(a<min)
				min=a;
			sum=sum+a;
		}
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		System.out.println("Average : " + sum/10);
	}

}

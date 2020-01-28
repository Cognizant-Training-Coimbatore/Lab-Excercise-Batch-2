import java.util.Scanner;

public class prog42 {

	public static void main(String[] args) 
	{
		int i=0,n,sum=0,avg;
		Scanner sc = new Scanner(System.in);
		
		while((n = sc.nextInt())!=-999)
		{
			sum+=n;
			i++;
		}
		avg=sum/i;
		System.out.println("AVG="+avg);
		System.out.println("sum="+sum);

	}

}

import java.util.Scanner;

public class prog19_counting_odd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit ");
		int a= sc.nextInt();
		int i;
		int count=0;
		for(i=0;i<=a;i++)
		{
			System.out.println("Enter the nos:"+i+"");
			int b=sc.nextInt();
			{
		        if(b%2!=0)
		        {
			       count++;
		        }
		    }
		}
		System.out.println("no: of odd nos:"+count);
	}

}

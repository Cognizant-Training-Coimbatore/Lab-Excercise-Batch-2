import java.util.Scanner;

public class Ass6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i,avi,av;
		int s=0;
		int a[]=new int[25];
Scanner sc=new Scanner(System.in);
System.out.println("Enter limit");
		n=sc.nextInt();
		System.out.println("Enter nos");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			
			if(a[i]!=-999)
	
			{
				s=s+a[i];
			
			}
			else
		{
				avi=s/i;
			System.out.println("Sum=" +s);
			System.out.println("avg=" +avi);
		System.exit(0);
			
		}

	}
		av=s/n;
		System.out.println("Sum="+s);
		System.out.println("Avg="+av);

}
}

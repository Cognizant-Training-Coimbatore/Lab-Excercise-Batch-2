import java.util.Scanner;

public class ex_q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[10];
		
		int i,flag=0,x;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter 10 numbers");
		for( i=0;i<10;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		
		System.out.println("enter no. to be searched");
		x=scanner.nextInt();

		for(i=0;i<10;i++)
		{
			if(a[i]==x)
				flag=1;
				
		}
		
		if(flag==1)
			System.out.println("number is present");
		else
			System.out.println("number is not present");
	}

}

import java.util.Scanner;

public class prog71_array_fromuser {

	public static void main(String[] args) {
		int n,num,grtr;
		System.out.println("Enter the maximum number");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int number[]=new int[n];
		int i;
		System.out.println("Enter number 0");
		number[0]=s.nextInt();
		grtr=number[0];
		for(i=1;i<n;i++)
		{
			System.out.println("Enter number "+i);
			num=s.nextInt();
			number[i]=num;
			if(num>grtr)
			{
				grtr=num;
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println("Number are "+number[i]);
		}
		System.out.println("greatest number is "+grtr);
		// TODO Auto-generated method stub

	}

}

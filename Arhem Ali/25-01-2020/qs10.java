import java.util.Scanner;

public class qs10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ar[]=new int[5];
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter value "+(i+1));
			int b=sc.nextInt();
			ar[i]=b;
		}
		 int small=ar[0];
		for(int i=1;i<5;i++)
		{
			if(ar[i]<small)
			{
				small=ar[i];
			}
		}
		System.out.println("small: "+small);

	}

}

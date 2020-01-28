import java.util.Scanner;

public class pgm10_25_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers: ");
		int i,small;
		for(i=0;i<5;i++)
		{
			num[i]=sc.nextInt();
		}
		small=num[0];
		for(i=1;i<5;i++)
		{
			if(num[i]<small)
			{
				small=num[i];
			}
		}
		System.out.println("Smallest number:"+small);
	}

}

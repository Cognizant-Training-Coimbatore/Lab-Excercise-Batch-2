import java.util.Scanner;

public class prog76_smallst_array {

	public static void main(String[] args) {
		int num,smlr;
		
		int number[]=new int[5];
		int i;
		System.out.println("Enter number 0");
		Scanner s=new Scanner(System.in);
		number[0]=s.nextInt();
		smlr=number[0];
		for(i=1;i<5;i++)
		{
			System.out.println("Enter number "+i);
			num=s.nextInt();
			number[i]=num;
			if(num<smlr)
			{
				smlr=num;
			}
		}
		for(i=0;i<5;i++)
		{
			System.out.println("Number are "+number[i]);
		}
		System.out.println("Smallest number is "+smlr);
		// TODO Auto-generated method stub

	}

}
		// TODO Auto-generated method stub


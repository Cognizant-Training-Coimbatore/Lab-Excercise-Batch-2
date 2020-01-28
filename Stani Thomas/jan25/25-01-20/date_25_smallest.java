import java.util.Scanner;

public class date_25_smallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[]=new int[5];
		int min=0,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no.s");
		for( i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
			if(i==0)
			{
				min=n[i];
			}
		}
		for(i=0;i<5;i++)
		{
			if(n[i]<min)
			{
				min=n[i];
			}
		}
		System.out.println("smallest no.is : "+min);
	}

}

import java.util.Scanner;

public class pgm_smallestno_array {

	public static void main(String[] args) {
		int num;
		int n[]=new int[5];
		System.out.println("enter the numbers");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			num=sc.nextInt();
			n[i]=num;
			
		}
		int min=n[0];
		for(int i=0;i<5;i++)
		{
			if(n[i]<min)
			{
				min=n[i];
			}
		
				
		}
		System.out.println("smallest element:" + min);
		
	}

}

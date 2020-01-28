import java.util.Scanner;

public class date_25_ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i,j;
		int n[]=new int[5];
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 no.s");
		for( i=0;i<5;i++)
		{
			n[i]=sc.nextInt();
			
		}
		for(i=0;i<5;i++) {
		for(j=i+1;j<5;j++)
		{
			if(n[j]<n[i])
			{
				a=n[i];
				n[i]=n[j];
				n[j]=a;
			}
		}
		}
		System.out.println("ascending order is");
		for(i=0;i<5;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("descending order is");
		for(i=4;i>=0;i--)
		{
			System.out.println(n[i]);
		}
		
	}

}

import java.util.Scanner;

public class date_25_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]=new int[10];
int i,a,c=0,f=0;		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 no.s");
		for( i=0;i<10;i++)
		{
			n[i]=sc.nextInt();
			
		}
		System.out.println("enter the element to be searched");
		a=sc.nextInt();
		for( i=0;i<10;i++)
		{
			if(n[i]==a)
			{ 
				c=i+1;
				f=1;
			}
			
		}
		if(f==1)
		{
			System.out.println("No. is in the list at "+c+"th position");
		}
		else
		{
		System.out.println("No. is not in the list");
		}
	}

}

import java.util.Scanner;

public class que6 {

	public static void main(String[] args) 
	{
		int ar[],s=0,d=0;
		ar=new int[100];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<100;i++)
		{
			System.out.println("Enter number:  ");
			ar[i]=sc.nextInt();
			if(ar[i]==-999)
			{
				d=i;
				break;
				
			}
		}
		for( int i=0;i<d;i++)
		{
			s=s+ar[i];
		}
		System.out.println("SUM: "+s);
		
		float av=s/d;
		
		System.out.println("AVG:"+av);

	}

}

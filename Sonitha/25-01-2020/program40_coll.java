import java.util.Scanner;


public class program40_coll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,nu;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the maximum size");
		n= sc.nextInt();
		
		int nus1[] = new int[n];
		
		System.out.println("Enter number 0");
		nu =sc.nextInt();
		int i;
		int gr =nu;
		
		for( i=1;i<0;i++) 
		{
			System.out.println("Enter number"+ i);
			nu = sc.nextInt();
			
			nus1[i] = nu;
			
			if(nu >gr) 
			{
				gr = nu;
			}
		}
		
		for( i=0;i<n;i++) 
		{
			System.out.println("Numbers are"+ nus1[i]);
		}
		
        System.out.println("greatest number"+ gr);
	}

}

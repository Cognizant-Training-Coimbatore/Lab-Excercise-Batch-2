import java.util.Scanner;

public class q8_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		
		int temp;
		for(int m=0;m<5;m++)
		{
			a[m]=sc.nextInt();
		}
		  for(int m=0;m<5;m++)
		  {
	            for(int n=m+1;n<5;n++)
	            {
	                if(a[m]>a[n])
	                {
	                    temp = a[m];
	                    a[m]=a[n];
	                    a[n]=temp;
	                    
	                }
	            }
		  }
		  System.out.println("Ascending order");
		  for(int m=0;m<5;m++)
		  {
			  System.out.println(a[m]);
		  }
		  for(int m=0;m<5;m++)
		  {
	            for(int n=m+1;n<5;n++)
	            {
	                if(a[m]<a[n])
	                {
	                    temp = a[m];
	                    a[m]=a[n];
	                    a[n]=temp;
	                }
	            }
		  }
		  System.out.println("Descending order");
		  for(int m=0;m<5;m++)
		  {
			  System.out.println(a[m]);
		  }
		 
	}

}

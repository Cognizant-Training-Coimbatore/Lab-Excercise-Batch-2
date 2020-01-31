import java.util.Scanner;

public class assessment_q10_array_multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,result=0;
		System.out.println("First array:");
		System.out.println("Enter an array size:");
		Scanner scanner=new Scanner(System.in);
		
		n=scanner.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of array:");
		
		for(int i=0;i<n;i++)
		{
			a[i]=scanner.nextInt();
			
		}
		
	
		System.out.println("Second array:");
		
		System.out.println("Enter the  array size:");
		
		n=scanner.nextInt();
		
		int b[]=new int[n];
System.out.println("Enter the elements of array:");
		
		for(int i=0;i<n;i++)
		{
			b[i]=scanner.nextInt();
			
		}
		
		
	
	for(int j=0;j<n;j++)
	{
		result=a[j]*b[j];
		System.out.println(result);
		
		
	}
	
		
		

	}

}

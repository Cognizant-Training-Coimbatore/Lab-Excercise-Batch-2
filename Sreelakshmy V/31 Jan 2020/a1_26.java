import java.util.Scanner;

public class a1_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
        int i,n,small;
	
	System.out.println("Enter the number of elements:") ;
		n = sc.nextInt();
	int[] a = new int[n];

		System.out.println("Enter the elements") ;
		for(i=0;i<n;i++)
		{
    		a[i] = sc.nextInt();
		}
	
	small = a[0];		   		
	for(i=1;i<n;i++)
    	{
		if(a[i]<small)
    		{
			small=a[i];
		}
		}
		
	System.out.println("Smallest of "+n+" elements in an array = "+small);

	}

}

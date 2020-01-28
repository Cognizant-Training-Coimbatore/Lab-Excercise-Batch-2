import java.util.Scanner;

public class prog75_ascndg_desndng_array {

	public static void main(String[] args) {
		
	    int temp;
		int a[]=new int[5];
		Scanner s=new Scanner(System.in);
	
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter number "+i);
			a[i]=s.nextInt();
		}
		for (int i = 0; i < 5; i++) 
        {
            for (int j = i + 1; j < 5; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
		System.out.print("Ascending Order:");
        for (int i = 0; i < 5; i++) 
        {
            System.out.println(a[i]);
        }
        System.out.print("Descending Order:");
        for (int i = 4; i>=0 ; i--) 
        {
            System.out.println(a[i]);
        }
        
		// TODO Auto-generated method stub

	}

}

import java.util.Scanner;
public class program24_max_min_avg {

	public static void main(String[] args)
	{
        int sum=0;
        int smal,large;
        Scanner s = new Scanner(System.in);
        int a[] = new int[10];
        smal=a[0];
        large=a[0];
        System.out.println("Enter the elements");
        for(int i = 0; i < 10; i++)
        {
            a[i] = s.nextInt();
            sum=sum+a[i];
            
        }
       int  avg=sum/10;
       System.out.println("Average is "+avg);
       for(int i=0;i<10;i++)
       {
    	   if(a[i]>large)
    		   large=a[i];
       }
       System.out.println("Maximum number is "+large);
       for(int i=1;i<10;i++)
       {
    	   if(a[i]<smal)
    		   smal=a[i];
       }
       System.out.println("Minimum number is "+a[0]);
       
	}
}


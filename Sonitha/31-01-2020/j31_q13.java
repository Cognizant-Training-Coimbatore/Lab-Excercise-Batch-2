import java.util.Scanner;

public class j31_q13 
{

	public static void main(String[] args) 
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the limit");
	  int lm=sc.nextInt();
      int a[] = new int[lm];
      System.out.println("Enter the elements in the given array");
      for(int i=0;i<lm;i++)
      {
    	  a[i]=sc.nextInt();
      }
      System.out.println("Enter the continguous subarray length");
      int k = sc.nextInt();
      int sum=0;
      for(int i=0;i<k;i++)
      {
    	  sum = sum+a[i];
      }
      int max = sum;
    
      for(int i=k;i<lm;i++)
      {
    	  sum = sum- a[i-k]+a[i];
    	  if(sum>max)
    	  {
    		  max=sum;
    	  }
      }
double avg = (double)sum/k;
System.out.println(avg+""+max);
	}

}

import java.util.Scanner;

public class j24_q3 {

	public static void main(String[] args) {
		
  Scanner sc = new Scanner(System.in);
  int lm =10;
  int[] arr = new int[lm];
  System.out.println("Enter 10 numbers");
  for(int r=0;r<lm;r++) {
 
  arr[r] = sc.nextInt();
  }
  System.out.println("The maximum number is : ");
 
  int max = 0;
  max = arr[0];
 
	  for(int j=1;j<lm-1;j++) {
		  if(arr[j]> max )
		  {
			  max = arr[j];
		  }
		  
	  
  }
  System.out.println(max);
  
  System.out.println("The minimum number is : ");
  
  int min = 0;
  min = arr[0];
  
	  for(int j=1;j<lm-1;j++) {
		  if(arr[j]<min)
		  {
			  min = arr[j];
		  }
		  
	  }
  
  System.out.println(min);
  
  System.out.println("The average of the numbers is : ");
  double sum = 0;
  for (int a =0;a<10;a++)
  {
	  sum = sum + arr[a];
  }
  double avg = (sum/10.0);
  System.out.println(avg);
	}

}

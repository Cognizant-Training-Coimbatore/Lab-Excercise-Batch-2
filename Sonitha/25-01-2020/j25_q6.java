import java.util.Scanner;

public class j25_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double arr[] = new double[5];
       Scanner sc = new Scanner(System.in);
       for(int i=0;i<5;i++)
       {
       System.out.println("Enter a number");
        arr[i]= sc.nextInt();
       
       }
       double sum =0;
       for(int i=0;i<5;i++) 
       {
    	   sum = sum + arr[i];
       }
       System.out.println("The sum of the numbers are : "+ sum);
       double avg = (sum/5.0);
       System.out.println("The average of the numbers are : "+ avg);
	}

}

import java.util.Scanner;
public class que6_array_sum_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         Scanner sc = new Scanner(System.in);
         int i;
         int sum=0;
         double avg=0;
         int numbers[] = new int[5];
         for(i=0;i<=4;i++)
         {
         System.out.println("Enter the element of array " +i);
         numbers[i] = sc.nextInt();
         }
         sum=numbers[0]+numbers[1]+numbers[2]+numbers[3]+numbers[4];
         avg=sum/5;
         System.out.println("The sum of numbers in the array is " +sum);
         System.out.println("The average of numbers in the array is " +avg);
	}

}

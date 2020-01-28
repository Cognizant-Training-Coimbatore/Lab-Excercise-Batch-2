import java.util.Scanner;

public class program51_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int sum = 0, num =0, average;
		
		System.out.println("enter the elements");
		Scanner sc = new Scanner(System.in);
		 for(int i=0; i< 5; i++) {
	         array[i] = sc.nextInt();
	         sum = sum+ array[i];
	         num++;
	         
		 }
		 average = sum/num;
		 
		 System.out.println("sum :" + sum);
		 System.out.println("average :" + average);
		}
	}



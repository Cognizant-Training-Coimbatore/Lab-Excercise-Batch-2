import java.util.Scanner;

public class program6_sum_avg_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr =new int[5];
		System.out.println("Enter five numbers");
		for(int i=0;i<5;i++) {
		
		int value = sc.nextInt();
		arr[i]=value;
		
		}
		System.out.println( "The numbers are :");
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
			
		}
	}

}

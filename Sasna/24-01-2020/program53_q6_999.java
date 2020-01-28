import java.util.Scanner;

public class program53_q6_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, sum=0, average, i=0;
		
		do {
		System.out.println("Enter the integer:");
			
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
	    i++;
		sum+=num;
		
		
		//System.out.println(num);
		}while(num != -999);
		
		
		average = sum/i;
		
		System.out.println("sum :" + sum);
		System.out.println("average:" + average);
		
		
	}
}

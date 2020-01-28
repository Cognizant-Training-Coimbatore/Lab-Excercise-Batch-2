import java.util.Scanner;

public class j24_q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int lm =0;
		int[] arr = new int[100];
	breakloop:	do
		{
			
			System.out.println("Enter the number");
			input = sc.nextInt();
			if(input==(-999)) { 
				break breakloop;
			
			}
			arr[lm]=input;
		lm=lm+1;
	
		
		}while(input!=(-999));
		
		double sum =0;
		double avg;
		for(int i=0;i<lm;i++)
		{
			sum = sum + arr[i];
		}
		System.out.println("The sum : "+ sum);
		avg = (sum/lm);
		System.out.println("The average is : "+ avg);

	}

}

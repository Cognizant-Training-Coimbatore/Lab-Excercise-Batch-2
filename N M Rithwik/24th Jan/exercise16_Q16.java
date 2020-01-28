import java.util.Scanner;

public class exercise16_Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,sum =0,average=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n intergers :");
		for(i=0;i!=999;)
		{
			i =sc.nextInt();
			sum = sum + i;
			average++;
		}
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + (sum/average));
		
	}

}

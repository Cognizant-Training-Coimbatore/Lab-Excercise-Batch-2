import java.util.Scanner;

public class practice11_count_odd_numbers {

	public static void main(String[] args) {
		int num=0;
		int count=0;
		int i=0;
		System.out.println("Enter five numbers:");
		for(i=0;i<5;i++)	
		{
			Scanner sc=new Scanner(System.in);
			num=sc.nextInt();
			int flag;
			if(num%2==0) {
				flag=0;
			}
			else
			{
				flag=1;
				count+=1;
			}
		}
		System.out.println("There are "+count+ " odd  numbers in it");
			
	
	}
}

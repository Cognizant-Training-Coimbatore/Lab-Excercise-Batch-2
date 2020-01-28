import java.util.Scanner;

public class sumofdig {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner soc =new Scanner(System.in);
		int sum=0,n;
		int m=soc.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
        System.out.println("sum of digits "+sum);
        
		
	
	}

}

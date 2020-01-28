import java.util.Scanner;

public class program20_count_odd_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  sum = 0;
		Scanner sc = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < 5; i++)
        {
            a[i] = sc.nextInt();
            if (a[i]%2 !=0) {
            	 sum = sum + a[i];
            }
           
        }
        System.out.println("Sum:"+sum);
		
		

	}

}

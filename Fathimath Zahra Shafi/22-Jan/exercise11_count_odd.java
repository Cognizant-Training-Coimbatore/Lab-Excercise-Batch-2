import java.util.Scanner;

public class exercise11_count_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,count=0;
		
		
		Scanner scanner = new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("enter 5 numbers");
		for(i=0;i<5;i++)
		{
			a[i]=scanner.nextInt();
			if(a[i]%2!=0)
				count++;
		}
		
 System.out.println("count of odd number: " +count);
	}

}

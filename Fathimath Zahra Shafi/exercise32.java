import java.lang.Math;
import java.util.Scanner;
public class exercise32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
 int max,min,i;
		
		System.out.println("enter min and max");
		Scanner scanner = new Scanner(System.in);
		min=scanner.nextInt();
		max=scanner.nextInt();
		
		int n = (int)(Math.random()*(max-min+1))+min;
		
		System.out.println("random number between " +min+ " and " +max+ " : " +n);
		
		
		
	}

}

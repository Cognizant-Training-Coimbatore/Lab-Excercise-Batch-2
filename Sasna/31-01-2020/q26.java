import java.util.Scanner;

public class q26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int small,i;
		System.out.println("enter the array index");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n];
		
		
		System.out.println("enter the array elements:" );
		for(i = 0; i< n; i++) {
			
			array[i] = sc.nextInt();
			
		}
		
		small = array[0];
		for( i=0; i < n ; i++) {
			
			
			if(small> array[i]) {
				
		   small = array[i];
			}
			
		}
		System.out.println("smallest element is "+ small);
		
		
		
	}

}

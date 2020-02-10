import java.util.Scanner;

public class q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,j, i,x,num,flag=0;
		System.out.println("enter the index");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		System.out.println("enter the element to search");
		x= sc.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("enter the elements:");
		for(i = 0; i< n; i++) {
			array[i] = sc.nextInt();
			
			}
		for(j = 0 ; j <n ; j++) {
			
			if(array[j] == x) {
			
				flag=1;
				//num = j;
				
			}
			
		}
		
		if(flag ==1) {
		System.out.println("element "+ x + "found at position"+ j);
		}else {
			System.out.println("element not found");
		}
		
	}

}

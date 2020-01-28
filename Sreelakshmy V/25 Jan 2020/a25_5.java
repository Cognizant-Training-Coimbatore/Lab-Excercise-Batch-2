import java.util.Scanner;

public class a25_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int x, flag=0, i,num = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element to search");
		x = sc.nextInt();		
		System.out.println("enter the elements");
		
		 for(i=0; i< 10; i++) {
	         array[i] = sc.nextInt();
	         if (array[i] == x) {
	        	 flag = 1;
	        	 num = i;
	        	 
	         }

		 }
		 if (flag ==1) {
			 System.out.println("the element" +x + "is found at position" +num);
		 }
		 else {
			 System.out.println("the element" +x + "is not found ");
		 }
		 

}
}
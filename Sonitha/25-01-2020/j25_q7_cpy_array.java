import java.util.Scanner;

public class j25_q7_cpy_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the array");
		int lm = sc.nextInt();
		int a[] =new int [lm];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<lm;i++) {
			
			  a[i] = sc.nextInt() ;
		}
         
          int b[] = a.clone();
          
          System.out.println("The elements in a array is :");
          for(int i=0;i<a.length;i++)
          {
        	  System.out.println(a[i]+ " ");
          }
          
          System.out.println("The elements in b array is :");
          for(int i=0;i<b.length;i++)
          {
        	  System.out.println(b[i]+ " ");
          }
	}

}

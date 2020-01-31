import java.util.Scanner;

public class j31_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit of the arrays :");
		int lm = sc.nextInt();
       int a[] = new int[lm];
       int b[] = new int[lm];
       System.out.println("Enter the elements in the first array");
       
       for(int i=0;i<lm;i++)
       {
    	   a[i]=sc.nextInt();
       }
       System.out.println("Enter the elements in the second array");
       
       for(int i=0;i<lm;i++)
       {
    	   b[i]=sc.nextInt();
       }
       
       int mul[] = new int[lm];
       for(int i=0;i<lm;i++)
       {
    	   mul[i] = a[i]*b[i];
    	   System.out.println(mul[i]);
       }
	
	}
}

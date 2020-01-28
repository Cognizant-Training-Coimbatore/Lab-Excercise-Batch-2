import java.util.Scanner;

public class prog54_999 {

	public static void main(String[] args) {
		int a,sum=0,i=0,x=0;
		double avg;
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter a number");
	    a=s.nextInt();
	    while(a!=-999)
	    {
	    	 System.out.println("Enter next number");
	 	     a=s.nextInt();
	 	     x=i+1;
	 	     sum=sum+a;
	    }
	    avg=sum/x;
	    System.out.println("sum= "+sum);
	    System.out.println("avg= "+avg);
		// TODO Auto-generated method stub

	}

}

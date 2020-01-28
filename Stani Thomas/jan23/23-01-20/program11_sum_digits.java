import java.util.Scanner;

public class program11_sum_digits {

	public static void main(String[] args) {
		int n,i,s=0,r;
		System.out.println("enter the no.");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
        for(i=0;n>0;i++)
        {
        	r=n%10;
        	s=s*10+r;
        	n=n/10;
        }
        System.out.println("no.of digits = "+i);
	}

}

import java.util.Scanner;

public class prog_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("You can enter numbers till-999");
        int a=0,b,count=0,sum=0;
        a=sc.nextInt();
        while(a!=-999)
        {
        	count++;
        	sum=sum+a;
        	a=sc.nextInt();
        }
        System.out.println("The sum is "+sum);
        System.out.println("The average is "+(sum/count));
	}

}

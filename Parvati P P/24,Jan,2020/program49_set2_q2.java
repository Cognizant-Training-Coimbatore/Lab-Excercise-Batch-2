import java.util.Scanner;

public class program49_set2_q2 {

	public static void main(String[] args) {
		int n,i,mul;
Scanner sc=new Scanner(System.in);
System.out.println("Enter an integer between 1 and 9");
n=sc.nextInt();
for(i=1;i<=n;i++)
{
	mul=n*i;
	
	System.out.println(n+" * "+i+" = "+mul);
}
	}

}

import java.util.Scanner;

class table{

int n,t;

void mul(int n) {
	
	for(int i=1;i<=10;i++)
		
	{
		t=n*i;
		System.out.println(i+ "*" +n+
				" = " +t);
	
}

}}


public class exercise25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		System.out.println("enter a number between 1 and 9");
		Scanner scanner=new Scanner(System.in);
		x=scanner.nextInt();
		table obj=new table();
		obj.mul(x);
		

	}

}
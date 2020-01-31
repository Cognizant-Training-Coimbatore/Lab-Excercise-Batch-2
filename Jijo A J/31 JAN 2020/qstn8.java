import java.util.Scanner;

public class qstn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner xx=new Scanner(System.in);
System.out.println("Enter three number a b c");
int a,b,c;
a=xx.nextInt();
b=xx.nextInt();
c=xx.nextInt();
if(b>a&&c>b)
		System.out.println("true");
else if(c>a)
	System.out.println("true");
else
	System.out.println("false");
xx.close();
	}

}

import java.util.Scanner;
public class Add
{
 public static void main(String[] args)
 {
 	Scanner sc=new Scanner(System.in);
	System.out.println("enter first no\n");
	int a=sc.nextInt();
	System.out.println("enteer second no\n");
        int b=sc.nextInt();
	int c=a+b;
	System.out.println("10 + 20 ="+c);
}
}
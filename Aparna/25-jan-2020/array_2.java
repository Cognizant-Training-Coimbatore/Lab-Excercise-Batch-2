package packA;

import java.util.Scanner;

public class array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n,num,greater;
System.out.println("enter the maximum size");
Scanner scanner=new Scanner(System.in);
n=scanner.nextInt();
int numbers1[]=new int[n];
int i;
System.out.println("enter the first value");
num=scanner.nextInt();
greater=num;
for(i=1;i<n;i++)
{
	System.out.println("enter number "+i);
	num=scanner.nextInt();
numbers1[i]=num;
if(num>greater)
{
	greater=num;
}
for(i=1;i<n;i++)
{
	System.out.println(numbers1[i]);
}
System.out.println("greatest number is: " +greater);
}

	}

}

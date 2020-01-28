package demo;

import java.util.Scanner;

public class q12_multitable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter any number between 1 to 9:   ");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
if((a<0)||(a>9))
{
	System.out.println("wrong choice");
}
else
{
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println(i+"*"+j+"="+(i*j));
		}
	}
}
	}

}

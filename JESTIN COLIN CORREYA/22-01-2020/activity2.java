package demo;

import java.util.Scanner;

public class activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
System.out.print("enter 5 integer numbers:  ");

Scanner s=new Scanner(System.in);
for(int i=0;i<5;i++)
{
sum=sum+s.nextInt();
}
float avg=sum/5;
System.out.println("sum value:"+sum);
System.out.println("average value:"+avg);
		
	}

}

package demo;

import java.util.Scanner;

public class q13_maxminavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max,min,sum;
System.out.print("enter 10 intergers:");
Scanner s=new Scanner(System.in);
max=min=sum=s.nextInt();
for(int i=1;i<10;i++)
{
	int a=s.nextInt();
	if(max<a)
	{
		max=a;
	}
	if(min>a) 
	{
		min=a;
	}
	sum+=a;
	
	
}
float avg=sum/10;
System.out.println("maximum="+max);
System.out.println("minimum="+min);
System.out.println("sum of number="+sum);
System.out.println("average="+avg);

	}

}

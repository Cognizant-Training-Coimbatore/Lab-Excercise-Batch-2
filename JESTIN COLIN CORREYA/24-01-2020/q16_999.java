package demo;

import java.util.Scanner;

public class q16_999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,i=1;
		System.out.println("enter number other than -999");
		Scanner s=new Scanner(System.in);
		int sum=s.nextInt();
		while((a=s.nextInt())!=-999)
{
	
	sum+=a;
	i++;
	
}
float avg= sum/i;
System.out.println("sum=:"+sum);
System.out.println("avg=:"+avg);
	}

}

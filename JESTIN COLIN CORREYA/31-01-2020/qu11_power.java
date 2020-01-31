package java50;

import java.util.Scanner;

public class qu11_power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter any number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int flag=0;
for(int i=0;i<a/4;i++)
{
	if(Math.pow(4,i)==a)
	{	
		flag=1;
		
	}
}
if(flag==1)
	{
		System.out.println("it is the power of4");
	}
else
{
	System.out.println("not");
}


}
	
}
	



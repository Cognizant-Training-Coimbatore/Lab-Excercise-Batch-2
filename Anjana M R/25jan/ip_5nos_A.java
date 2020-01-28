
package PackA;

import java.util.Scanner;

public class ip_5nos_A {
	void assign()
	{
		
Scanner sc=new Scanner(System.in);
int n;
System.out.println("Enter limit");
n=sc.nextInt();
int a[]=new int[n];
int s=0;
float av;
for(int i=0;i<n;i++)
{
	
	a[i]=sc.nextInt();
s=s+a[i];	
}
av=s/n;
System.out.println("sum"+s);
System.out.println("Average"+av);



}
	public static void main(String[] args) {
		ip_5nos_A obj=new ip_5nos_A();
		obj.assign();
	}
}


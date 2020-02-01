package Project;

import java.util.Scanner;

public class pgm31_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter value for n");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
System.out.println("Enter elements");
for(int i=0;i<n;i++)
{
	a[i]=sc.nextInt();
}
int sm=a[0];
for(int i=1;i<a.length;i++)
 if(a[i]<sm)
sm=a[i];
System.out.println("Smallest element:"+sm);
	}

}

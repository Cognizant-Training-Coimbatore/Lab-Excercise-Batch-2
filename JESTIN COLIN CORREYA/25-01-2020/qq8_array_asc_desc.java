package demo;

import java.util.Scanner;

public class qq8_array_asc_desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter length of array:");
		Scanner s=new Scanner(System.in);
		int l=s.nextInt();
int a[]=new int[l];
System.out.println("enter array elements:");
for(int i=0;i<l;i++)
{
	a[i]=s.nextInt();

}
for(int i=0;i<l;i++)
{
	for(int j=i+1;j<l;j++)
	 if(a[i]<a[j])
	 {
		 int temp=a[j];
		 a[j]=a[i];
		 a[i]=temp;
	 }
}
System.out.println("descending order:");
for(int i=0;i<l;i++)
{
	System.out.println(a[i]);
}
System.out.println("ascending order:");
for(int i=l-1;i>=0;i--)
{
	System.out.println(a[i]);
}
	}

}

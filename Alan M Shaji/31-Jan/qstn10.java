package javatest;

public class qstn10 {
	public static void main(String args[])
	{
		int a[]= {1,2,3,4,5};
		int b[]= {2,3,4,5,6};
		int c[]=new int[5];
		for(int i=0;i<5;i++)
		{
			c[i]=a[i]*b[i];
			System.out.print(c[i]+"\t");
		}
	}

}

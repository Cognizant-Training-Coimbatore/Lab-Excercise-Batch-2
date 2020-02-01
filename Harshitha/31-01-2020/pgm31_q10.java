package Project;

import java.util.Scanner;

public class pgm31_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=new int[4];
		System.out.print("{");
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]*b[i];
			System.out.print(c[i]+",");
		}
		System.out.println("}");
	}

}

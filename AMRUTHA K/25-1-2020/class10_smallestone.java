package pack2;

import java.util.Scanner;

public class class10_smallestone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]=new int[5];
		int first=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no 1");
		first=sc.nextInt();
		
		for(int i=0;i<4;i++) {
			System.out.println("enter no"+2);
			array[i]=sc.nextInt();
		
		if (first>array[i]) {
			first=array[i];
			
		}
		
		}
		
		System.out.println("smallest:"+first);
	}

}

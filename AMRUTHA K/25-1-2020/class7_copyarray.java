package pack2;

import java.util.Scanner;

public class class7_copyarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String array1[]=new String[5];
		String array2[]=new String[5];
		System.out.println("enter string");
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			 array1[i]=sc.nextLine();
			 }
		System.out.println("copying");
		for(int i=0;i<5;i++) {
			array2[i]=array1[i];
		
		System.out.println(array2[i]);}
		

	}

}

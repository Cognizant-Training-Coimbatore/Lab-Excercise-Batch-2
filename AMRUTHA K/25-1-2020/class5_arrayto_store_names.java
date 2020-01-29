package pack2;

import java.util.Scanner;

public class class5_arrayto_store_names {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[]=new String[5];
		String upper[]=new String[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter names");
		for(int i=0;i<5;i++) {
			 names[i]=sc.nextLine();
			 
			
		}
		System.out.println("names in uppercase:");
		for(int i=0;i<5;i++) {
			upper[i]=names[i].toUpperCase();
			
			System.out.println(upper[i]);
			
		}

	}

}

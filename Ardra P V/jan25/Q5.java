package packA;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		String a[],x[]=new String[6];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 frends name");
		for(i=1;i<6;i++) {
			x[i]=sc.nextLine();
			
			
		}
		for(i=1;i<6;i++) {
		System.out.println(x[i].toUpperCase());}
}
}

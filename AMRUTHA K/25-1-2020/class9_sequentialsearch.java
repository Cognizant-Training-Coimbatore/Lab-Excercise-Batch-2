package pack2;

import java.util.Scanner;

public class class9_sequentialsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[10];
		System.out.println("enter nos");
		Scanner sc=new Scanner(System.in);
		int count=0;
		for(int i=0;i<10;i++) {
			numbers[i]=sc.nextInt();
			if(numbers[i]==6) {
				count++;
				
			}
			
				
			}
		if(count!=0) {
			System.out.println("present");
		}
		else
			System.out.println("absent");

	}

}

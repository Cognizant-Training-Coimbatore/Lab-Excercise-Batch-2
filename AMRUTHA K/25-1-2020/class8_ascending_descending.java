package pack2;

import java.util.Scanner;

public class class8_ascending_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numbers[]=new int[5];
		System.out.println("enter nos");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++) {
			numbers[i]=sc.nextInt();
			
				
			}
		for(int k=0;k<5;k++) {
			for(int j=0;j<4;j++) {
				if(numbers[j]>numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
							numbers[j+1]=temp;
				}
			}
			
			
			
			
		}
		System.out.println("ascending order:");
		for(int a=0;a<5;a++) {
			System.out.println(numbers[a]);
		}
		for(int k=0;k<5;k++) {
			for(int j=0;j<4;j++) {
				if(numbers[j]<numbers[j+1]) {
					int temp=numbers[j];
					numbers[j]=numbers[j+1];
							numbers[j+1]=temp;
				}
			}
			}
		
		System.out.println("descending order:");
		for(int a=0;a<5;a++) {
			System.out.println(numbers[a]);
		}
		

	}

}

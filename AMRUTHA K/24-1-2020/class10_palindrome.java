package demo11;

import java.util.Scanner;

public class class10_palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter a string");
		String x=a.nextLine();
		String v=x.toLowerCase();
		int u=v.length();
		
		for(int i=0;i<u;i++) {
			System.out.print(x.charAt(u-i));
			 if(x.charAt(u-i)!=x.charAt(i)) {
				 System.out.println("palindrome");
			 }
			 else 
					System.out.println("not palindrome ");
				
				
			
		}
		
		
		
		
		
		
		

	}

}

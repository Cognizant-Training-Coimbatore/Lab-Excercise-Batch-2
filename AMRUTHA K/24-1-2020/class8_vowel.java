package demo11;

import java.util.Scanner;

public class class8_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a=new Scanner(System.in);
		System.out.println("enter a string");
		String x=a.nextLine();
		String v=x.toLowerCase();
		int count=0;
		
	
		for(int i=0;i<v.length();i++) {
			char ch=v.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' ){
				
				count++;
				
			}
			
				
			}
		System.out.println(count);
		

	}

}

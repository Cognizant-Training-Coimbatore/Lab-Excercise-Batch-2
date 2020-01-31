package abc;

import java.util.Scanner;

public class date31_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2="";
		int i,l;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		str1=sc.nextLine();
		l=str1.length();
		for(i=l-1;i>=0;i--)
		{
			str2=str2+str1.charAt(i);
		}
		System.out.println(str2);
	}

}

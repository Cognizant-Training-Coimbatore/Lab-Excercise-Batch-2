package java50;

import java.util.Scanner;

public class qu4_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("enter a string");
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String rev="";
for(int i=a.length()-1;i>=0;i--)
{
	rev=rev+a.charAt(i);
}
System.out.println(rev);
	}

}

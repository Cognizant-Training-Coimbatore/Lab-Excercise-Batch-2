package day3;

import java.util.Scanner;

class rev
{
	void print()
	{
	Scanner rev = new Scanner (System.in);
	System.out.println("Enter the string");
	String str=rev.nextLine();
	String reverse="";
	for(int i=str.length()-1;i>=0; i--)
	{
	reverse= reverse+ str.charAt(i);
	}
	System.out.println("Reverse of the string: " +reverse);
	}
}

public class Q7_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rev obj=new rev();
		obj.print();

	}

}

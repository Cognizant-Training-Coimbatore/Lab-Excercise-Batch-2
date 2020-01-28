package day3;

import java.util.Scanner;

class vowel
{
	void print()
	{
	Scanner rev = new Scanner (System.in);
	System.out.println("Enter the string");
	String str=rev.nextLine();
	int k=0;
	for(int i=str.length()-1;i>=0; i--)
	{
	if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'||str.charAt(i)=='A'||str.charAt(i)=='E'||str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U')
	k++;
	}
	System.out.println("NUMBER OF vowels in  the string: " +k);
	}
}
public class Q8_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vowel obj=new vowel();
		obj.print();

	}

}

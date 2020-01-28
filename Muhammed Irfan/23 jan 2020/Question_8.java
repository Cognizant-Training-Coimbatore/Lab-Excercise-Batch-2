package demo;

import java.util.Scanner;

class programming
{
	programming()
  {
	  System.out.println("i love programming language");
  }
	
	programming(String name)
  {
	  System.out.println(name);
  }
}
public class Question_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner (System.in);
		
		System.out.println("if u want to print something press 1 else press 0");
		int c=scan.nextInt();
		System.out.println("Enter the Sentence1");
		String a=scan.nextLine();
		if(c==1)
		{
			
			programming java=new programming (a);
		}
		else
		{
			programming nothingpassed=new programming ();
		}
		
	}

}

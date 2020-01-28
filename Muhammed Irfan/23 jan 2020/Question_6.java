package demo;

import java.util.Scanner;

class students
{
  students()
  {
	  System.out.println("Unknown");
  }
	
  students(String name)
  {
	  System.out.println(name);
  }
}

public class Question_6 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan=new Scanner (System.in);
		String a=scan.nextLine();
		students john1=new students(a);
		students john=new students();
	}

}

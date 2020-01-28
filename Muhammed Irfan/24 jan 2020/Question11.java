package demo;

import java.util.Scanner;

class a11
 {
	void values(int a,int b)
	{
		 System.out.println("The values in between "+a+" and "+b+" are /n" ); 
	 for(int i=a+1;i<b;i++)
	 {
		 System.out.println("\n"+i ); 
	 }
	}
	}
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("enter the lower and higher limit");
		Scanner scan=new Scanner(System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		a11 obj=new a11();
		obj.values(x,y);
		
	}


}

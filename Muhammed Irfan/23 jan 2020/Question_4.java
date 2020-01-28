package demo;

import java.util.Scanner;

class operators
{
  void add(int a,int b)
  {
	  int q=a+b;
   System.out.println("sum = "+q);
  }
  void sub(int a,int b)
  {
	 int p=a-b;
   System.out.println("sum = "+p);
  }
  void pdt(int a,int b)
  {
   System.out.println("sum = "+a*b);
  }
  void div(double a,double b)
  {
   System.out.println("sum = "+a/b);
  }
}
public class Question_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter two numbers");
		operators op= new operators();
		Scanner scan=new Scanner (System.in);
		int x=scan.nextInt();
		int y=scan.nextInt();
		op.add(x,y);
		op.sub(x,y);
		op.pdt(x,y);
		op.div(x,y);
	}

}

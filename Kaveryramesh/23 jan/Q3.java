package demo;

import java.util.Scanner;

class Area
{
int l,b;
   void assign(int x,int y)
   {
	   
	   l=x;
	   b=y;
   }
   int returnArea()
   {
	   return(l*b);
   }
}

public class Q3 {

	public static void main(String[] args) {
		int l,b;
		// TODO Auto-generated method stub
         Scanner s=new Scanner(System.in);
         System.out.println("enter length");
         l=s.nextInt();
         System.out.println("enter breadth");
         b=s.nextInt();
          Area a=new Area();
          a.assign(l,b);
         System.out.println(a.returnArea());
         
         
	}

}

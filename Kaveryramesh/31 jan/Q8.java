package practical_excercise;

import java.util.Scanner;

class A
{
	public boolean ret()
	{
		  System.out.println("Enter 3 numbers");
          Scanner s=new Scanner(System.in);
         int a =s.nextInt();
         int b =s.nextInt();
         int C =s.nextInt();
         if(b>a&&C>b)
               return true;
         else
        	 return false;
	}
   }

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		boolean s=a.ret();
		System.out.println(s);
                        
	}

}

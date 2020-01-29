package demo;

import java.util.Scanner;

class arithmatic{
	int x,y,z,a,b;
	float p=(float)0;
	void operation() {
		x=a+b;
		y=a-b;
		z=a*b;
		p=(float)a/b;
		
		
	}
	void assign() {
		System.out.println("enter fst no");
		Scanner h=new Scanner(System.in);
		a=h. nextInt();
		System.out.println("enter sec no");
		Scanner u=new Scanner(System.in);
		b=u.nextInt();
		
	}
	void display()
	{
		System.out.println("sum="+x+"\ndiff="+y+"\nmult="+z+"\ndiv="+p);
	}
}
public class classadd_sub_mult_div {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arithmatic obj=new arithmatic();
		obj.assign();
		obj.operation();
		obj.display();
   
	}

}

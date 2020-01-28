package demo;

import java.util.Scanner;

class area
{

	int returnarea(int l,int b)
	{
		return l*b;
		
	}
	
}

public class q3arearect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print("enter length:");
Scanner s=new Scanner(System.in);
int len=s.nextInt();
System.out.print("enter breadth:");
int br=s.nextInt();
area obj=new area();
System.out.println("area="+obj.returnarea(len,br));

	}

}

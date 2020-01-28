package demo;

import java.util.Scanner;

class Area
{
	int length,bredth;
	//void assign(int l,int b)
	//{
	  //length=l;
	  //bredth=b;
	//}
	int returnArea(int l,int b)
	{
		int result;
		result=l*b;
		return result;
	}
}

public class program36_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length,bredth;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length;");
		length=sc.nextInt();
		System.out.println("enter the bredth;");
		bredth=sc.nextInt();
		Area obj=new Area();
		System.out.println("area is"+obj.returnArea(length,bredth));
	}

}

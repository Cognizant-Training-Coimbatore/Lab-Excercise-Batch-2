package practical_exercises;

import java.util.Scanner;


class example
{
	boolean compare(int a,int b,int c)
	{
		if(b>a&&c>b)
			return true;
		return false;
		
	}
}



public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		System.out.println("enter 3 numbers");
		Scanner scanner=new Scanner(System.in);
		a=scanner.nextInt();
		b=scanner.nextInt();
		c=scanner.nextInt();
		example obj = new example();
		System.out.println(obj.compare(a, b, c));
	
			
		
		
		
			

	}

}

import java.util.Scanner;

public class electricity {

	public static void main(String[] args) 
	{
		System.out.println("enter the old reading");
		Scanner sc=new Scanner(System.in);
		int old = sc.nextInt();
		System.out.println("enter the new reading");
		int new1= sc.nextInt();
		int unit=new1-old;
		if(unit >= 1 && unit <= 100)
		{
			System.out.println("free");
		}
		else if(unit >= 101 && unit <= 200)
		{
			System.out.println(unit*1);
		}
		else if(unit >= 201 && unit <= 300)
		{
			System.out.println(unit*2);
		}
		else if(unit >= 301 && unit <= 400)
		{
			System.out.println(unit*3);
		}
		else if(unit > 400)
		{
			System.out.println((unit*4*0.1)+(unit*4));
		}
		else
		{
			System.out.println("invalid");
		}

	}

}

package packss;

import java.util.Scanner;

public class program2_divisionby0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a:");
		int x=sc.nextInt();
		System.out.println("enter b:");
		int y=sc.nextInt();
		try {
			int p=x/y;
			
			System.out.println(p);
			
		}
		catch(Exception e) {
			System.out.println("dividing by zero"+e);
		}
	}

}

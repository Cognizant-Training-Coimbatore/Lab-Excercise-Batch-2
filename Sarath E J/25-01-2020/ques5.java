package packB;

import java.util.Scanner;

public class ques5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name[] = new String [5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 names");
		for(int i =0;i<5;i++)
		{
			name[i] = sc.next();
			
		}
		System.out.println("\nNames in capital letters are:\n");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i].toUpperCase());
		}
		
		

	}

}

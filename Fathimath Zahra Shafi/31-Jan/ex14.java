package practical_exercises;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter x,y,n");
		Scanner scanner=new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int n = scanner.nextInt();
		
		System.out.println((x*n)%y);
		
		
	

	}

}

package demo_25_01_2020;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner sc = new Scanner(System.in);

		    String [] Names = new String[4];
		    System.out.print("Enter names");
		    for(int i = 0; i < Names.length; i++) 
		    {
		    	
		        Names[i] = sc.nextLine();
		    }
	
		    for(int i = 0; i < Names.length; i++) 
		    {
		    	
		    	System.out.print("\n"+Names[i].toUpperCase());
		    }
	}

}

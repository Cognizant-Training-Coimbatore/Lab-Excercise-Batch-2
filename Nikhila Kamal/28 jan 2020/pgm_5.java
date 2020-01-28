package pgm_excercises_28_jan;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pgm_5 {

	public static void main(String[] args) {
		List<String> mylist=new ArrayList<String>();
		mylist.add("nikhila");
		mylist.add("kamal");
		mylist.add("java");
		System.out.println("enter the element and postition to be added");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		int n=sc.nextInt();
		mylist.add(n,s);
		System.out.println("after adding: " + mylist);
		
	}

}

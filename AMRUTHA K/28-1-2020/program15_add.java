package packagee;

import java.util.Scanner;
import java.util.TreeSet;

public class program15_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>geet=new TreeSet<Integer>();
		geet.add(2);
		geet.add(4);
		geet.add(8);
		geet.add(9);
		geet.add(0);
		System.out.println(geet);
		System.out.println("enter a number");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		
		System.out.println("the new treeset"+geet.ceiling(x));

	}

}

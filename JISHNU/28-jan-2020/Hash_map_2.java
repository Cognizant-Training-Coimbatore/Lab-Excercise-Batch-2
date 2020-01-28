package day6;

import java.util.HashMap;
import java.util.Scanner;

public class Hash_map_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> mymap=new HashMap<Integer, String>();
		mymap.put(1, "Java");
		mymap.put(2, "Java");
		mymap.put(3, "Jishnu");
		mymap.put(4, "Selenium");
		int opt;
		System.out.println("Enter any number between 1 and 4");
		Scanner sc=new Scanner(System.in);
		opt=sc.nextInt();
		String name=mymap.get(opt);
		System.out.println(name);
		mymap.remove(3);
		System.out.println(mymap);
	}

}

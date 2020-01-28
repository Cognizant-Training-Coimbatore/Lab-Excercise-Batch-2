package sol.java;

import java.util.HashMap;
import java.util.Scanner;

public class program12_newhash {

	public static void main(String[] args) 
	{
			HashMap<Integer,String> hm = new HashMap<Integer,String>();
			hm.put(1,"java");
			hm.put(2,"c");
			hm.put(3,"selenium");
			hm.put(4,"pearl");
			int opt;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the option");
			opt = sc.nextInt();
			String s = hm.get(opt);
			System.out.println(s);
			hm.remove(5);
			

	}

}

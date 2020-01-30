package demo;

import java.util.HashMap;
import java.util.Scanner;

public class program_50_hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "c#");
		hashmap1.put(3, "selenium");
		hashmap1.put(4, "pearl");
		hashmap1.put(5, "cobol");
		int opt;
		Scanner s=new Scanner(System.in);
		System.out.println("enter option");
		opt=s.nextInt();
		String c= hashmap1.get(opt);
		System.out.println(c);
		hashmap1.remove(5);

	}

}

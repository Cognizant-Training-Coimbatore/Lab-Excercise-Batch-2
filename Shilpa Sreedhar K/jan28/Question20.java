package jan28;

import java.util.Scanner;
import java.util.TreeMap;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer, String> map1=new TreeMap<Integer, String>();
		map1.put(1, "red");
		map1.put(2, "green");
		map1.put(3, "white");
		map1.put(4, "blue");
		map1.put(5, "violet");
		System.out.println(map1);
		System.out.println("enter a key");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(map1.headMap(n));

	}

}

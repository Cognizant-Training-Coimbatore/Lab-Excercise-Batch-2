package packagee;

import java.util.HashMap;
import java.util.Scanner;

public class program4_retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>opp=new HashMap<Integer, String>();
		opp.put(1, "ammu");
		opp.put(2, "acha");
		opp.put(3, "ammma");
		System.out.println("retrieving element index(1-3):");
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		String a=opp.get(s);
		System.out.println(a);

	}

}

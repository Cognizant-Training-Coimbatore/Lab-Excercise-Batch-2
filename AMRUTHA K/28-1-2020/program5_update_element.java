package packagee;

import java.util.HashMap;
import java.util.Scanner;

public class program5_update_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>opp=new HashMap<Integer, String>();
		opp.put(1, "ammu");
		opp.put(2, "acha");
		opp.put(3, "ammma");
		System.out.println("replacing element index(1-3):");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("replacing element:");
		Scanner ab=new Scanner(System.in);
		String s=ab.nextLine();
		opp.replace(x, s);
		System.out.println(opp);

	}

}

package packagee;

import java.util.HashMap;
import java.util.Scanner;

public class program7_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>opp=new HashMap<Integer, String>();
		opp.put(1, "ammu");
		opp.put(2, "acha");
		opp.put(3, "ammma");
		System.out.println("enter the element in 2nd pos");
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		opp.replace(2,a );
		System.out.println(opp);
		

	}

}

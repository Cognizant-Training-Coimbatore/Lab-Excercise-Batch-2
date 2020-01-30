package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class pgmex04_retreive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList lists1=new ArrayList();
		lists1.add("abhi");
		lists1.add("Irfan");
		lists1.add("Stani");
		Scanner sc = new Scanner(System.in);
		int op=sc.nextInt();
		System.out.println(op+"th element is .."+lists1.get(op));
		
	}

}

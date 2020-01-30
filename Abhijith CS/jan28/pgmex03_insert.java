package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pgmex03_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al =new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str= sc.nextLine();
		al.add(0,str);
		System.out.println(al);
	}

}

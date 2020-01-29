package project1;

import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class jan28_q20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		NavigableMap<Integer, String> m = new TreeMap<>();
		m.put(1,"Java");
		m.put(2,"C#");
		m.put(3,"Selenium");
		m.put(4,"Perl");
		m.put(5,"Cobol");
	m.put(6,"Fortran");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println(m.headMap(n+1));

	}

}

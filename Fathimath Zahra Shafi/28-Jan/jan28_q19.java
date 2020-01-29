package project1;

import java.util.NavigableMap;
import java.util.TreeMap;

public class jan28_q19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NavigableMap<Integer, String> m = new TreeMap<>();
		m.put(1,"Java");
		m.put(2,"C#");
		m.put(3,"Selenium");
		m.put(4,"Perl");
		m.put(5,"Cobol");
	m.put(6,"Fortran");
		System.out.println("first key="+m.firstKey());
		System.out.println("last key="+m.lastKey());
		
		
		
	}

}

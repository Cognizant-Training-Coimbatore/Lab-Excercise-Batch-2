package Package3;

import java.util.TreeMap;

public class program117_set6_q18 {

	public static void main(String[] args) {
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("c7", "C++");
		tmap.put("c2", "Java");
		tmap.put("c3", "Selenium");
		tmap.put("c4", "Cobol");
		tmap.put("c5", "Perl");
		System.out.println("The Collection view of the treemap is :"+tmap.firstEntry());
		System.out.println("The Collection view of the treemap is :"+tmap.lastEntry());

	}

}

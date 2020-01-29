package set_6;

import java.util.TreeMap;

public class qn_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, String> map = new TreeMap<String, String>();
		map.put("c6", "C++");
		map.put("c2", "Java");
		map.put("c5", "Selenium");
		map.put("c4", "Cobol");
		map.put("c3", "Perl");
		System.out.println("The required treemap is :"+map.headMap("c4",true));
		System.out.println("The required treemap is :"+map.headMap("c6",false));
	}

}

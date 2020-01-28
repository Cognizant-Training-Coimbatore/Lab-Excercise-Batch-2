import java.util.TreeMap;

public class j28_q20_lessthanGivenKeyValue {

	public static void main(String[] args) {
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("c6", "C++");
		tmap.put("c2", "Java");
		tmap.put("c5", "Selenium");
		tmap.put("c4", "Cobol");
		tmap.put("c3", "Perl");
		System.out.println("The required treemap is :"+tmap.headMap("c4",true));
		System.out.println("The required treemap is :"+tmap.headMap("c6",false));

	}

}

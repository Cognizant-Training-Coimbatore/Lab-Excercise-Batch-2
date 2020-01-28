import java.util.TreeMap;

public class j28_q19_firstLowLastHighestKey {

	public static void main(String[] args) {
		TreeMap<String, String> tmap = new TreeMap<String, String>();
		tmap.put("c7", "C++");
		tmap.put("c2", "Java");
		tmap.put("c3", "Selenium");
		tmap.put("c4", "Cobol");
		tmap.put("c5", "Perl");
		System.out.println("The First Key of the treemap is :"+tmap.firstKey());
		System.out.println("The Last Key of the treemap is :"+tmap.lastKey());


	}

}

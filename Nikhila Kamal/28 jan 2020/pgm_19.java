import java.util.TreeMap;

public class pgm_19 {

	public static void main(String[] args) {
		TreeMap <String,String> map1 = new TreeMap <String,String> ();




		  map1.put("r", "Red");

		  map1.put("g", "Green");

		  map1.put("b", "Black");

		  map1.put("w", "White");



		  System.out.println("Orginal TreeMap content: " + map1);

		  System.out.println("Greatest key: " + map1.firstKey());

		  System.out.println("Least key: " + map1.lastKey());

	}

}

import java.util.TreeMap;

public class Q19_get_lowest_key_highest_key {

	public static void main(String[] args) {
		TreeMap <Integer,String> h1=new TreeMap<Integer,String>();
		h1.put(1,"Orange");
		h1.put(2,"Red");
		h1.put(3,"Blue");
		h1.put(4,"White");
		h1.put(5,"green");
		System.out.println("First key  :"+h1.firstKey());
		System.out.println("Last key   :"+h1.lastKey());

	}

}

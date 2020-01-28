import java.util.NavigableMap;
import java.util.TreeMap;
//publi19-Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.  
class p90_fist_last_key {

	public static void main(String[] args) {
		NavigableMap<Integer, String> m = new TreeMap<>();
		m.put(1,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
		m.put(5,"five");
		m.put(6,"six");
		m.put(7,"seven");
		m.put(8,"eight");
		m.put(9,"nine");
		System.out.println("first key="+m.firstKey());
		System.out.println("first key="+m.lastKey());
		

	}

}

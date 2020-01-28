import java.util.NavigableMap;
import java.util.TreeMap;

//17-Write a Java program to get a collection view of the values contained in this map. 
public class p93_collection_view {

	public static void main(String[] args) {
		TreeMap<Integer, String> m = new TreeMap<>();
		m.put(3,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
		m.put(5,"five");
		m.put(6,"six");
		m.put(9,"seven");
		m.put(8,"eight");
		m.put(1,"nine");
		System.out.println("Collection view="+m.values());

	}

}

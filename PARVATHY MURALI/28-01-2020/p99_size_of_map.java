import java.util.TreeMap;

//6-Write a Java program to count the number of key-value (size) mappings in a map.  
public class p99_size_of_map {

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
		int n=m.size()+1;
		System.out.println("Size of map="+n);

	}

}

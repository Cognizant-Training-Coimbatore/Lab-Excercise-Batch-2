import java.util.NavigableMap;
import java.util.TreeMap;

public class Highest_lowest_key {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		NavigableMap<Integer, String> m = new TreeMap<>();
		m.put(3,"one");
		m.put(2,"two");
		m.put(3,"three");
		m.put(4,"four");
		m.put(5,"five");
		m.put(6,"six");
		m.put(9,"seven");
		m.put(8,"eight");
		m.put(1,"nine");
		System.out.println("first key="+m.ceilingEntry(m.firstKey()));
		System.out.println("first key="+m.floorEntry(m.lastKey()));

	}

}

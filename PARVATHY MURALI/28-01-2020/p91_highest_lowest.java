import java.util.NavigableMap;
import java.util.TreeMap;

//18-Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map. 

public class p91_highest_lowest 
{

	public static void main(String[] args)
	{
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

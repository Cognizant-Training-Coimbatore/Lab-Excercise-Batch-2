import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

//20-Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given key.
public class p89_map_index {

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
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int n=sc.nextInt();
		System.out.println(m.headMap(n+1));
		

	}

}

import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class date28_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

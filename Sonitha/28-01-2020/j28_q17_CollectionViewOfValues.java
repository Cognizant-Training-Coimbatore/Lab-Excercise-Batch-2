import java.util.HashMap;

public class j28_q17_CollectionViewOfValues {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(1, "C++");
		hashmap.put(2, "Java");
		hashmap.put(3, "Selenium");
		hashmap.put(4, "Cobol");
		hashmap.put(5, "Perl");
		System.out.println("The Collection view of the hashmap is :"+hashmap.values());

	}

}

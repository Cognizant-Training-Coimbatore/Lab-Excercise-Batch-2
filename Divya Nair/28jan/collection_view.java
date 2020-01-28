import java.util.TreeMap;

public class collection_view {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			TreeMap<Integer, String> n = new TreeMap<>();
			n.put(3,"one");
			n.put(2,"two");
			n.put(3,"three");
			n.put(4,"four");
			n.put(5,"five");
			n.put(6,"six");
			n.put(9,"seven");
			n.put(8,"eight");
			n.put(1,"nine");
			System.out.println("Collection view="+n.values());

	}

}

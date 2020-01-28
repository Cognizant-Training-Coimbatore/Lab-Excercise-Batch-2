import java.util.TreeMap;

public class question17_collection_view {

	public static void main(String[] args) {
		TreeMap<Integer, String> b1=new TreeMap<Integer, String>();
		b1.put(1, "gokul");
		b1.put(2, "Amritha");
		b1.put(3, "Ami");
		b1.put(4, "Aayisha");
		
		System.out.println("The collection view of the map "+b1.values());
	}

}

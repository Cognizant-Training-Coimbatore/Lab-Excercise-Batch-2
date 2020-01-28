import java.util.TreeMap;

public class question19_last_first_key {

	public static void main(String[] args) {
		TreeMap<Integer, String> b1=new TreeMap<Integer, String>();
		b1.put(1, "gokul");
		b1.put(2, "Amritha");
		b1.put(3, "Ami");
		b1.put(4, "Aayisha");
		System.out.println("The highest key currently in this map :"+b1.lastKey());
		System.out.println("The lowest key currently in this map :"+b1.firstKey());
		
	}

}

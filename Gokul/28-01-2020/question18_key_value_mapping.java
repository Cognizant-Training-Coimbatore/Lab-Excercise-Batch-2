import java.util.TreeMap;

public class question18_key_value_mapping {

	public static void main(String[] args) {
		TreeMap<Integer, String> b1=new TreeMap<Integer, String>();
		b1.put(1, "gokul");
		b1.put(2, "Amritha");
		b1.put(3, "Ami");
		b1.put(4, "Aayisha");
		
		System.out.println("The greatest key-value map:"+b1.lastEntry());
		System.out.println("The least key-value map:"+b1.firstEntry());
		
	}

}

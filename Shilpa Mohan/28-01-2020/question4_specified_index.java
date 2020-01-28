import java.util.HashMap;

public class question4_specified_index {

	public static void main(String[] args) {
		HashMap<Integer,String> colours = new HashMap<Integer,String>();
		colours.put(1, "Red");
		colours.put(2, "Black");
		colours.put(3, "Yellow");
		colours.put(4, "Green");
		colours.put(5, "Blue");
		
		String name = colours.get(3);
		System.out.println(name);
	}

}

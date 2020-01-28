import java.util.TreeMap;

public class qstn_2801_20 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			TreeMap<Integer,String> tree_map= new TreeMap<Integer,String>();  
			  tree_map.put(1, "Red");
			  tree_map.put(2, "Green");
			  tree_map.put(3, "Black");
			  tree_map.put(4, "White");
			  tree_map.put(5, "Blue");
			  System.out.println(tree_map);
				System.out.println("Orginal TreeMap content: " + tree_map);
				  System.out.println("Checking the entry for 3: ");
				  System.out.println("Value is: " + tree_map.floorEntry(3));

	}

}

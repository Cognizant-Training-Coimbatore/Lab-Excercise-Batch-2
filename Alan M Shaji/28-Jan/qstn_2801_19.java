import java.util.TreeMap;

public class qstn_2801_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tree_map= new TreeMap<Integer,String>();  
		  tree_map.put(1, "Red");
		  tree_map.put(2, "Green");
		  tree_map.put(3, "Black");
		  tree_map.put(4, "White");
		  tree_map.put(5, "Blue");
		  System.out.println(tree_map);
		  System.out.println("Greatest key: " + tree_map.firstKey());
		  System.out.println("Least key: " + tree_map.lastKey());
	}
  
}

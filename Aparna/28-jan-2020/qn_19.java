package set_6;

import java.util.TreeMap;

public class qn_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap <String,String> tree_map1 = new TreeMap <String,String> ();

		
		  tree_map1.put("C2", "Red");
		  tree_map1.put("C1", "Green");
		  tree_map1.put("C4", "Black");
		  tree_map1.put("C3", "White");

		  System.out.println("Orginal : " + tree_map1);
		  System.out.println("Greatest key: " + tree_map1.firstKey());
		  System.out.println("Least key: " + tree_map1.lastKey());
		 }
	}


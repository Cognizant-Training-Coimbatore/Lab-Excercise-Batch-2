package Package3;

import java.util.ArrayList;
import java.util.Collections;

public class program109_set6_q11 {

	public static void main(String[] args) {
		 ArrayList <String> c1 = new ArrayList <String> ();
		  c1.add("Red");
		  c1.add("Green");
		  c1.add("Black");
		  c1.add("White");
		  c1.add("Pink");
		  System.out.println("\nOriginal array list: " + c1);
		  Collections.swap(c1, 1, 2); 
		  int num=c1.size();
		  for (int index = 0; index < num; index++)
			   System.out.println(c1.get(index));
		  
		  
		  

	}

}

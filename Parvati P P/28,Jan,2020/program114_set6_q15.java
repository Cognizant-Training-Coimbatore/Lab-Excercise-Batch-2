package Package3;

import java.util.TreeSet;

public class program114_set6_q15 {

	public static void main(String[] args) {
		TreeSet <Integer>tree_num = new TreeSet<Integer>();
		 
		   tree_num.add(10);
		   tree_num.add(20);
		   tree_num.add(30);
		   tree_num.add(40);
		   tree_num.add(50);
		   tree_num.add(60);
		   
		   System.out.println("Greater than or equal to 19 : "+tree_num.ceiling(19));
		   System.out.println("Greater than or equal to 31 : "+tree_num.ceiling(31));
		
	}

}

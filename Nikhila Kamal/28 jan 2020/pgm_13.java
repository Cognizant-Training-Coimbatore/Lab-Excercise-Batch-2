package pgm_excercises_28_jan;

import java.util.TreeSet;

public class pgm_13 {

	public static void main(String[] args) {
		 TreeSet<String> myset = new TreeSet<String>();
		 myset.add("nikhila");
		 myset.add("kamal");
		 myset.add("java");
		 System.out.println("list: " + myset);
		 TreeSet<String> myset1=new TreeSet<String>();
		 myset1.add("c");
		 myset1.add("c++");
		 myset1.add("selenium");
		 System.out.println("list:" + myset1);
		 myset.addAll(myset1);
		 System.out.println("new list: " + myset);
		 
		 

	}

}

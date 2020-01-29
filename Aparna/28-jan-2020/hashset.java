package collection;

import java.util.HashSet;
import java.util.Set;

public class hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> myset =new HashSet<Integer>();  //avoid duplication
myset.add(1);
myset.add(1);
myset.add(1);
myset.add(3);
System.out.println(myset);
	}

}

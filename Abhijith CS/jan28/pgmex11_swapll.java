package collections;

import java.util.LinkedList;

public class pgmex11_swapll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Red");
		l_list.add("White");
		l_list.add("Pink");
		System.out.println("Before swapping....");
		System.out.println(l_list);
		String str = l_list.get(0);
		l_list.set(0, "Pink");
		l_list.set(4, str);
		System.out.println("After swapping....");
		System.out.println(l_list);
	}

}

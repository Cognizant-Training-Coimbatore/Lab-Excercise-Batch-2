package packagee;

import java.util.LinkedList;

public class program10_fstlast_element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>abc=new LinkedList<String>();
		abc.add("man");
		abc.add("moon");
		abc.add("sun");
		abc.add("man");
		abc.add("moon");
		abc.add("sun");
		System.out.println(abc);
		Object fst=abc.getFirst();
		System.out.println(fst);
		Object last=abc.getLast();
		System.out.println(last);

	}

}

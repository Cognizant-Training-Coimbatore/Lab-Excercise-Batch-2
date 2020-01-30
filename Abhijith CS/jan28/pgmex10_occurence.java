package collections;

import java.util.LinkedList;
import java.util.Scanner;

public class pgmex10_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l_list = new LinkedList<String>();
		l_list.add("Red");
		l_list.add("Green");
		l_list.add("Red");
		l_list.add("White");
		l_list.add("Pink");
		Object fir=l_list.getFirst();
		Object las=l_list.getLast();
		System.out.println("First element : "+fir);
		System.out.println("Last element : "+las);
	}

}

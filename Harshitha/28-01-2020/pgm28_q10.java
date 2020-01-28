import java.util.LinkedList;
import java.util.Scanner;

public class pgm28_q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> li=new LinkedList<String>();
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		li.add("Blue");
		li.add("Indigo");
		System.out.println("Original list:"+li);
		System.out.println("First Occurence:"+li.getFirst());
		System.out.println("Last Occurence:"+li.getLast());
	}   


}

package pgm_excercises_28_jan;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class pgm_3 {

	public static void main(String[] args) {
	List<String> mylist=new  ArrayList<String>();
	mylist.add("nikhila");
	mylist.add("kamal");
	System.out.println(mylist);
	
	
	mylist.add(0,"java");
	
	System.out.println("new list: " + mylist);
	
	}

}

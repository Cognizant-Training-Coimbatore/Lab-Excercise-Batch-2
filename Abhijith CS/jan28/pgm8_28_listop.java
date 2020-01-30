package collections;

import java.util.ArrayList;
import java.util.List;

public class pgm8_28_listop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al =new ArrayList<String>();
		al.add("Abhijith");
		al.add("Stani");
		al.add("Irfan");
		System.out.println("Total items: "+al.size());
		System.out.println("Testing manu exists..."+al.contains("manu"));
		System.out.println("Printing all items..."+al);
		System.out.println("Removing Stani......"+al.remove("Stani"));
		System.out.println("Updated list..."+al);
	}

}

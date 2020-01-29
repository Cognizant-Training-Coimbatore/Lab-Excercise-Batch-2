package packA;

import java.util.ArrayList;
import java.util.Collections;

public class prg_91_Q6 {

	public static void main(String[] args)
	{
		ArrayList<String>a1 = new ArrayList<String>(3);
		a1.add("Banglore");
		a1.add("Kolkata");
		a1.add("Mumbai");
		System.out.println("Original list is:" +a1);
		a1.ensureCapacity(5);
		a1.add("Kochi");
		a1.add("Wayanad");
		System.out.println("New arraylist is:"+a1);

	}

}

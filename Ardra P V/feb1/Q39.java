package jan31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Q39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
        al.add("car");
        al.add("bike");
        al.add("scootty");
        al.add("jcb");
		System.out.println("Orginal map : " +al);
		
		System.out.println("first key : " +al.get(1));

		System.out.println("last key : " +al.get(al.size()));
		

	}

}

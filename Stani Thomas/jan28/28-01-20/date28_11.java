import java.util.Collections;
import java.util.LinkedList;

public class date28_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>myset=new LinkedList<String>();
		myset.add("stani");
		myset.add("jacky");
		myset.add("abhijith");
		myset.add("irfan");
		System.out.println("original list is "+myset);
		Collections.swap(myset,0, 3);
		System.out.println("after swapping 1st and last elements list is"+myset);
	}

}

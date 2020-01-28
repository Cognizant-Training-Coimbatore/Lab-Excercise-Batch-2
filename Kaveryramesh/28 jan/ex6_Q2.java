package demo;
import java.util.ArrayList;
import java.util.Iterator;


public class ex6_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> myset = new ArrayList<String>();
		myset.add("kavery");
		myset.add("fathima");
		myset.add("sasna");

		System.out.println(myset);
		Iterator iterator1=myset.iterator();
		while(iterator1.hasNext())
		{
			Object obj=iterator1.next();
			System.out.println(obj);
		}
	}


	}



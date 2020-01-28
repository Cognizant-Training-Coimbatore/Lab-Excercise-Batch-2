package hello;

import java.util.ArrayList;
import java.util.Iterator;

public class ques2 {

	public static void main(String[] args) 
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(2);
		arr.add(5);
		arr.add(3);
		arr.add(13);
		Iterator iterator1 = arr.iterator();
		while(iterator1.hasNext())
		{
			Object obj = iterator1.next();
			System.out.println(obj);
		}

	}	

		

	}



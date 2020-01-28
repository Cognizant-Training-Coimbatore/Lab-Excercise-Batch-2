package day6;

import java.util.HashSet;
import java.util.Set;

public class Hash_set 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<Integer> myset= new HashSet<Integer>();
		myset.add(1);
		myset.add(1);
		myset.add(1);
		myset.add(2);
		myset.add(3);
		myset.add(1);
		myset.add(3);
		myset.add(5);
		System.out.println(myset);// will not take duplicate value,only one 1 will be saved
	}
}

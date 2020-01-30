package collections;

import java.util.ArrayList;

public class pgm10_28_forarraylist {
	static void printarray(int arr[])
	{
		for(int x:arr)
		{
			System.out.println(x);
		}
	}
	static void printArrayList(ArrayList list1)
	{
		for(Object obj:list1)
		{
			System.out.println(obj);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no[]=new int[5];
		no[0]=1;
		no[1]=2;
		no[2]=3;
		no[3]=4;
		printarray(no);
		ArrayList lists1=new ArrayList();
		lists1.add("abhi");
		lists1.add("Irfan");
		lists1.add("Stani");
		printArrayList(lists1);
		
	}

}

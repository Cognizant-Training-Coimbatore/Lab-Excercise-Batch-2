package collection;

import java.util.ArrayList;

public class arraylist345 {
	static void printArray(int myarray[])
	{
		for(int x:myarray)
		{
			System.out.println(x);
		}
	}
		static void printArrayList(ArrayList list1)
		{
			for(Object ob:list1)
			{
				System.out.println(ob);
			}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no[]=new int[3];
no[0]=10;
no[1]=109;
no[2]=106;
printArray(no);
ArrayList mylist=new ArrayList();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
printArrayList(mylist); //to print arraylist
	}

}

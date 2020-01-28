package Package2;

import java.util.ArrayList;

public class program101_enhanced_for_loop {
	static void printArray(int myarray[]) 
	{
	for(int x:myarray)
	{
		System.out.println(x);
	}
	}
	static void printArrayList(ArrayList List1)
	{
		for(Object obj:List1)
		{
			System.out.println(obj);
		}
	}
	
public static void main(String[] args) {
int no[]=new int[3];
no[0]=10;
no[1]=2;
no[2]=3;
printArray(no);
ArrayList mylist=new ArrayList();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
printArrayList(mylist);
}}

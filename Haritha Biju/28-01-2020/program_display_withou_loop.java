import java.util.ArrayList;
import java.util.List;
//string display without for loop

public class program_display_withou_loop 
{ 	
	static void printArray(int myarray[])
	{	for(int x:myarray)
			System.out.println(x);
	}
	static void printArrayList(ArrayList list1)
	{
		for(Object obj:list1)
			System.out.println(obj);
	}
	public static void main(String[] args) 
	{
				int n[]=new int[4];
				n[0]=1;
				n[1]=3;
				n[3]=7;
				n[2]=5;
				printArray(n);
				
				ArrayList list=new ArrayList();
				list.add("Java");
				list.add("C++");
				list.add("C");
				printArrayList(list);

	}

}

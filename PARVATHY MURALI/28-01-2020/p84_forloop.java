import java.util.ArrayList;

public class p84_forloop {

static void printArray(int myarray[])
{
	for(int x:myarray)
	{
		System.out.println(x);
	}
}
static void printArraylist(ArrayList list1)
{
	for(Object obj:list1)
	{
		System.out.println(obj);
	}
}

	public static void main(String[] args) {
		int no[]=new int[3];
		no[0]=10;
		no[1]=2;
		no[2]=4;
		printArray(no);
		ArrayList mylist=new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printArraylist(mylist);
		
		
	}
		

	

}

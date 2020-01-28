import java.util.ArrayList;
public class program50_enhanced_forloop 
{

static void printArray(int myarray[])
{
	for(int x:myarray)
	{
		System.out.println(x);
		
	}
}
static void printarrayList(ArrayList List1)
{
	for(Object obj:List1)
	{
		System.out.println(obj);
	}
}


	public static void main(String[] args)
	{
		int no[] = new int[3];
		no[0] = 10;
		no[1] = 2;
		no[2] = 3;
		printArray(no);
		ArrayList mylist = new ArrayList();
		mylist.add("item1");
		mylist.add("item2");
		mylist.add("item3");
		printarrayList(mylist);

	}

	private static void printArrayList(ArrayList mylist) {
		// TODO Auto-generated method stub
		
	}

}

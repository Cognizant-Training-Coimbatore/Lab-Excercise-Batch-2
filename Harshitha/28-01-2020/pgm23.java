import java.util.ArrayList;

public class pgm23 {
 static void printArray(int myarray[])
 {
	 for(int x:myarray)
		 System.out.println(x);
}
static void  printArrayList(ArrayList l1)
{
	 for(Object ob:l1)
		 System.out.println(ob);
}	
public static void main(String[] args) {
		// TODO Auto-generated method stub
int n[]=new int[3];
n[0]=78;
n[1]=8;
n[2]=45;
printArray(n);
ArrayList<String> mylist=new ArrayList<String>();
mylist.add("item1");
mylist.add("item2");
mylist.add("item3");
printArrayList(mylist);
	}

}

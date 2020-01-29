package set_6;


import java.util.HashMap;
import java.util.Scanner;

public class qn_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,String> mylist=new HashMap<Integer,String>();
mylist.put(1, "anu");
mylist.put(2, "ammu");
mylist.put(3, "ron");
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
mylist.replace(2, s);
System.out.println(mylist);
	}

}

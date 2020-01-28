import java.util.LinkedList;

public class date28_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>myset=new LinkedList<String>();
		myset.add("stani");
		myset.add("jacky");
		myset.add("abhijith");
		myset.add("irfan");
		System.out.println("original list is "+myset);
		Object a=myset.getFirst();
		System.out.println("1st element is "+a);
		Object b=myset.getLast();
		System.out.println("last element is "+b);
	}

}

import java.util.TreeSet;

public class date28_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>myset=new TreeSet<String>();
		myset.add("stani");
		myset.add("jacky");
		myset.add("abhijith");
		myset.add("irfan");
		System.out.println("1st list is "+myset);
		TreeSet<String>myset1=new TreeSet<String>();
		myset1.add("red");
		myset1.add("blue");
		myset1.add("green");
		myset1.add("yellow");
		System.out.println("2nd list is "+myset1);
		myset.addAll(myset1);
		System.out.println("new combined list is "+myset);
	}

}

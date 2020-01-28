package jan28;

import java.util.ArrayList;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("blue");
		list1.add("pink");
		list1.add("white");
		System.out.println(list1);
		String first=list1.get(0);
		String last=list1.get(list1.size()-1);
		System.out.println("first is :" +first );
		System.out.println("last is :" +last );
	}

}

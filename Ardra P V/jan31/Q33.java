package jan31;

import java.util.ArrayList;

public class Q33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>(4);
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		System.out.println(list1);
		list1.set(1, 600);
		System.out.println(list1);
	}

}

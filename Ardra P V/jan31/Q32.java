package jan31;

import java.util.ArrayList;

public class Q32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>(4);
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		list1.ensureCapacity(5);
		list1.add(500);
		for(Integer temp:list1) {
			System.out.println(temp);
		}
		

	}

}

package jan31;

import java.util.ArrayList;

public class Q34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(100);
		list1.add(200);
		list1.add(300);
		list1.add(400);
		
		System.out.println("orginal array list" +list1);
        System.out.println( "print using index");
        int no=list1.size();
        for(int i=0;i<no;i++) {
        	System.out.println(list1.get(i)+" : " +i);
        }


	}

}

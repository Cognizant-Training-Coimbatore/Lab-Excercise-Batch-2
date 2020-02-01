package jan31;

import java.util.ArrayList;

public class jan32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> st=new ArrayList<String>(5);
		st.add("red");
		st.add("blue");
		st.add("white");
		st.add("green");
		st.add("black");
		System.out.println(st);
		st.ensureCapacity(6);
		
		//to increase capacity we use ensureCapacity()
		st.add("violet");
		System.out.println(st);
		/*for (String s: st) {
            System.out.println(s);
      }*/


	}

}

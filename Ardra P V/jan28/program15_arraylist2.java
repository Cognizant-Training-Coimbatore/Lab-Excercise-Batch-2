import java.util.ArrayList;
import java.util.List;

public class program15_arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> al=new ArrayList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        System.out.println("Element at 2nd pos : " +al.get(2));
        for(String s:al) {
        	System.out.println(s);
        }
	}

}

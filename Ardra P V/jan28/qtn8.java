import java.util.ArrayList;
import java.util.List;

public class qtn8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        System.out.println("orginal array list" +al);
        System.out.println( "print using index");
        int no=al.size();
        for(int i=0;i<no;i++) {
        	System.out.println(al.get(i)+" : " +i);
        }

	}

}

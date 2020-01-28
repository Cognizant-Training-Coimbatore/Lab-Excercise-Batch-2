import java.util.ArrayList;
import java.util.List;

public class program17_arraylist_operation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<String>();
        al.add("amit");
        al.add("anurag");
        al.add("sachin");
        al.add("sabu");
        System.out.println("total items : " +al.size());
        System.out.println(al.contains("sachin"));
        System.out.println("Print all elemets " +al);
        al.remove("amit");
        System.out.println(al);
	}

}

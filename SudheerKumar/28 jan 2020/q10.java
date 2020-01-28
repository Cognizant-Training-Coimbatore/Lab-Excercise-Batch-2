import java.util.ArrayList;
public class q10 {

	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		list1.add("red");
		list1.add("green");
		list1.add("yellow");
        list1.add("orange");
        list1.add("maroon red");
        System.out.println(list1);
        String first=list1.get(0);
        String last=list1.get(list1.size()-1);
        System.out.println("first is:"+first);
        System.out.println("last is:"+last);
		// TODO Auto-generated method stub

	}

}

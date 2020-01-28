import java.util.ArrayList;
import java.util.List;

public class corejava_q6_increse_size_arraylst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String>list_Strings=new ArrayList<String>();
		list_Strings.add("apple");
		list_Strings.add("orange");
		list_Strings.add("banana");
		list_Strings.add("lemon");
		System.out.println(list_Strings);
		
		((ArrayList<String>) list_Strings).ensureCapacity(8);
		list_Strings.add("pineapple");
		list_Strings.add("grapes");
		list_Strings.add("supporta");
		list_Strings.add("gua");
		System.out.println(list_Strings);
		
		
		
		
	}

}

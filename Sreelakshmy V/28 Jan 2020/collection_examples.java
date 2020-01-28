import java.util.ArrayList;
import java.util.List;

public class collection_examples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> al=new ArrayList<String>();
al.add("sree");
al.add("Sr");
al.add("Lek");
al.add("Sas");
System.out.println("An element at 2nd positin:" +al.get(2));
for(String s:al)
{
	System.out.println(s);
}
	}

}

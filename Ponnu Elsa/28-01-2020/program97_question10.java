import java.util.LinkedList;
import java.util.List;


public class program97_question10  {

	public static void main(String[] args) {
		List<String> li=new LinkedList<String>();
		li.add("AA");
		li.add("AB");
		li.add("AA");
		li.add("AA");
		li.add("BB");
		System.out.println("The first occurance of AA : "+li.indexOf("AA"));
		System.out.println("The last occurance of AA : "+li.lastIndexOf("AA"));
		
	}

}

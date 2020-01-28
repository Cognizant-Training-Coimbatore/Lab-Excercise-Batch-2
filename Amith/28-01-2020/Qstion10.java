import java.util.LinkedList;

public class Qstion10 {

	public static void main(String[] args)
	{
		LinkedList<String>list=new LinkedList<String>();
		list.add("ASA");
		list.add("BBA");
		list.add("ASA");
		list.add("CCA");
		list.add("ASA");
		System.out.println("first occurance of ASA is"+list.indexOf("ASA"));
		System.out.println("Last occurance od ASA is "+list.lastIndexOf("ASA"));
		

	}

}

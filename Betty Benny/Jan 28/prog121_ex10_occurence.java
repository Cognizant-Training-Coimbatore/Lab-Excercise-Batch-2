import java.util.LinkedList;
public class prog121_ex10_occurence {

	public static void main(String[] args) {
LinkedList<String> ob=new LinkedList<String>();
		
		ob.add("red");
		ob.add("blue");
		ob.add("white");
		ob.add("yellow");
		ob.add("pink");
		System.out.println("The list is:"+ob);
		System.out.println("The first occurence is:"+ob.getFirst());
		
		System.out.println("The last occurence is:"+ob.getLast());
	}

}

package Tuesday;
import java.util.Iterator;
import java.util.LinkedList;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> lin=new LinkedList<String>();
		lin.add("tiger");
		lin.add("man");
		lin.add("gun");
		lin.add("stone");
		lin.add("paper");
		Iterator p=lin.listIterator(2);
		while(p.hasNext())
		{
			System.out.println(p.next());
		}
		
	}

}

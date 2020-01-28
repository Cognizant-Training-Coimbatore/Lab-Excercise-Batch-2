import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class p83_treeeset {

	public static void main(String[] args) {
		TreeSet<String> m=new TreeSet();
		m.add("Paru");
		m.add("Pappan");
		m.add("Asha");
		m.add("Anjana");
		System.out.println(m);
		java.util.Iterator<String> name=m.iterator();
		while(name.hasNext())
		{
			Object ob=name.next();
			System.out.println(ob);
			
		}
		

	}

}

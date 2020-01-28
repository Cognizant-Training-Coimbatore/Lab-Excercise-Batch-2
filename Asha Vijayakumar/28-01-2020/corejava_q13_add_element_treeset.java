import java.util.TreeSet;
public class corejava_q13_add_element_treeset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				TreeSet<String> hsh1=new TreeSet<String>();
				hsh1.add("red");
				hsh1.add("blue");
				hsh1.add("white");
				hsh1.add("yellow");
				hsh1.add("pink");
				System.out.println("The first set of elements are:"+hsh1);
				TreeSet<String> hsh2=new TreeSet<String>();
				hsh2.add("violet");
				hsh2.add("red");
				hsh2.add("yellow");
				hsh2.add("indigo");
				hsh2.add("orange");
				System.out.println("The second set of elements are:"+hsh2);
				hsh1.addAll(hsh2);
				System.out.println("The concatenation of treeset:"+hsh1);
				
			}

		

	}



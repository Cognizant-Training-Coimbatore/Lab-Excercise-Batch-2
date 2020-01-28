import java.util.TreeSet;

//2-Write a Java program to iterate through all elements in a array list. 
public class p82_iterate {

	public static void main(String[] args) {
		

				TreeSet<String> m=new TreeSet();
				m.add("one");
				m.add("two");
				m.add("three");
				m.add("four");
				System.out.println(m);
				java.util.Iterator<String> name=m.iterator();
				while(name.hasNext())
				{
					Object ob=name.next();
					System.out.println(ob);
					
				}
				

			}

		


	}



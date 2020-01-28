
    import java.util.Iterator;
	import java.util.TreeSet;

	public class q02 {

		public static void main(String[] args) {
			TreeSet<String> myset=new TreeSet<String>();
			myset.add("one");
			myset.add("two");
			myset.add("three");
			myset.add("four");
			System.out.println(myset);
			Iterator iterator1=myset.iterator();
			while(iterator1.hasNext())
			{
				Object obj=iterator1.next();
				System.out.println(obj);
			}
			// TODO Auto-generated method stub

		}

	}





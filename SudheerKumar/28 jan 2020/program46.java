
    import java.util.Iterator;
	import java.util.TreeSet;

	public class program46 {

		public static void main(String[] args) {
			TreeSet<String> myset=new TreeSet<String>();
			myset.add("sudheer");
			myset.add("srinivas");
			myset.add("naresh");
			myset.add("rahul");
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




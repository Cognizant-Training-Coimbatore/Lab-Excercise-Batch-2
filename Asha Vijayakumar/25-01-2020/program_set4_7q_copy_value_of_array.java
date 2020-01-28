
public class program_set4_7q_copy_value_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[]= {5,7,3,2};
		int b[]= new int[a.length];
		b=a;
		System.out.println("array a contains the element:");
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
			
		}
		System.out.println("array b contains the element:");
		for(i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}


public class program3_index_out_of_bound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[]=new int[2];
			System.out.println("acess 3rd index" +a[3]);
		}
		catch(Exception e) {
			System.out.println("Exception thrown" +e);
		}
		System.out.println("out of block");

	}

}

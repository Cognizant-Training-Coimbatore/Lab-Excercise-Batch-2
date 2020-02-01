
public class Q10_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[]= {1,2,3,4,5};
		int a2[]= {1,2,3,4,5};
		int a3[]=new int[5];
		for(int i=0;i<a1.length;i++)
		{
			a3[i]=a1[i]*a2[i];
		}
		for(int i=0;i<a1.length;i++)
		{
			System.out.println(a3[i]);
		}

	}

}

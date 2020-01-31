
public class program10_mul_arrays {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b[]= {1,2,3,4,5};
		String result="";
		for(int i=0;i<=a.length-1;i++)
		{
			int n1=a[i];
			int n2=b[i];
			result=result+Integer.toString(n1*n2);
			
		}
		System.out.println("{"+result+" "+"}");

		
		
		

	}

}

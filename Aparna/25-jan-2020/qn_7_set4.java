package set4;

public class qn_7_set4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i;
	int n[] = {3,4,5,6,7};
	int b[] = new int[n.length];
	System.out.println("original array");
	for(i=0;i<n.length;i++)
	{
		System.out.print(n[i] + "");
	}
	for( i=0;i<n.length;++i){
		b[i]=n[i];
	}
	System.out.println("");
	System.out.println("copied array");
	for( i=0;i<b.length;++i){
		System.out.print( b[i] +"");
	}
}
}
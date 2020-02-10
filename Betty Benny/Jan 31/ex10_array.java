
public class ex10_array {

	public static void main(String[] args) 
	{
		int[] n1=new int[3];
		int[] n2=new int[3];
		int[] n3=new int[3];
		n1[0]=1;
		n1[1]=2;
		n1[2]=8;
		n2[0]=5;
		n2[1]=8;
		n2[2]=4;
		for(int i=0;i<3;i++)
		{
			n3[i]=n1[i]*n2[i];
			System.out.println(n3[i]);
		}

	}

}

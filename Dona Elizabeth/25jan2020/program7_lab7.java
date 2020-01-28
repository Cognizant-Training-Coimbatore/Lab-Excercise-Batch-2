
public class program7_lab7 {

	public static void main(String[] args) {
		int j=1,i;
		int a1[]=new int[3];
		int a2[]=new int[a1.length];
		for(i=0;i<3;i++)
		{
			a1[i]=j;
			j++;
		}
		System.out.println("First array: ");
		for(i=0;i<3;i++)
		{
			System.out.println(a1[i]);
		}
		for(i=0;i<3;i++)
		{
			a2[i]=a1[i];
		}
		System.out.println("Copied array: ");
		for(i=0;i<3;i++)
		{
			System.out.println(a2[i]);
		}

		
	}

}

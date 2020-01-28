import java.util.Scanner;

public class prog_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int i,j,k;
        for(i=0;i<=5;i++)
        {
        	k=1;
        	for(j=0;j<=i;j++)
        	{
        		System.out.print(k+" ");
        		k++;
        	}
        	System.out.println();
        }
	}

}

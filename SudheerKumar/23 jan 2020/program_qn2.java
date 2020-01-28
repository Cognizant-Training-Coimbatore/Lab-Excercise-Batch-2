import java.util.Scanner;

class v1
{
	int n,i,c;
	void mult()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter number bw 1 and 9");
	    n=s.nextInt();
	    for(i=1;i<=10;i++)
	    {
	    	c=n*i;
	    System.out.println(+n+ "*" +i+ "=" +c);
	    }
	    
	}
}
public class program_qn2 {

	public static void main(String[] args){
		v1 obj=new v1();
		obj.mult();
		// TODO Auto-generated method stub

	}

}

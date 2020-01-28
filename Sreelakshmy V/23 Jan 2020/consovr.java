class cov
{
	int a,b;
	cov()
	{
		System.out.println("Cons 1 is running");
	}
	cov(int a,int b)
	{
		System.out.println("Con 2 is running");
	}
}

public class consovr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
cov ob=new cov();
cov ob2=new cov(10,3);
	}

}

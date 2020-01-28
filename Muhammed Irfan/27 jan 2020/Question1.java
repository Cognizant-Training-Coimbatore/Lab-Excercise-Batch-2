package monday;

public class Question1 {

	static void pos(int num)
	{
		if(num>0)
		{
			System.out.println("number is valid!!");
		}
		else
		{
			throw new ArithmetcException("negative values and zero are not acceptable");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pos(5);
		pos(-5);
	}

}

package demo;

public class nested_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5, y=10;
		if(x>10)
		{
			if(y>99)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
		else
		{
			if(y<99)
			{
				System.out.println("true");
			}
			else
			{
				System.out.println("false");
			}
		}
	}

}

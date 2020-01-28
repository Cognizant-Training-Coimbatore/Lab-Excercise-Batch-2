package demo;

public class NestedIf {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=-10,y=6;
		if(x>0)
		{
			if(y>0)
		System.out.println("both are positive");
			else
				System.out.println("x positive and y negative");
			
		}
		else
		{
			if(y>0)
		System.out.println("y positive and x negative");
			else
				System.out.println("both are positive");
			
		}
			
	}
}

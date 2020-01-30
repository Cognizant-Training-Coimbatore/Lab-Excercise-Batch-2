class calc {
	int a,b;
	calc(int x,int y)
	{
		a=x;
		b=y;
		
	}
	void sumofnumbers() {
		System.out.println(a+b);
	}
}





public class program18_parameterised_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc c= new calc(10,20);
		c.sumofnumbers();
	}

}

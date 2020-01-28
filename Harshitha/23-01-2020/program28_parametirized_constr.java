class calc
{
	int a,b;
	calc(int x,int y)//constructor
	{
		a = x;
		b = y;
		
	}
	void sumOfNumber() {
		System.out.println(a+b);
	}
}
public class program28_parametirized_constr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     calc obj = new calc(5,10);//here the value is passed to the constructor
     obj.sumOfNumber();
     
	}

}

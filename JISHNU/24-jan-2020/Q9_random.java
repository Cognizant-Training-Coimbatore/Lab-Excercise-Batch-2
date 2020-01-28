package day3;

import java.util.Random;

class E
{
	int a,ran;
	void ran()
	{
		Random ran=new Random();
	 a=ran.nextInt();
	 System.out.println(a);
	}
}
public class Q9_random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E obj= new E();
		obj.ran();
	}

}

package project1;


interface A
{
	void meth1();
	void meth2();
}


class MyClass implements A
{
	public void meth1()
	{
		System.out.println("method 1 is implementing...");
	}
	
	public void meth2()
	{
		System.out.println("method 2 is implementing...");
	}
}





public class jan29_q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		MyClass obj=new MyClass();
		obj.meth1();
		obj.meth2();

	}

}

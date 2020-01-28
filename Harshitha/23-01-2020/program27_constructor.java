class test1{
	int a,b;
	void assign(int x,int y) {
		a=x;
		b=y;
	}
	test1()//constructor
	{
		a=10;
		b=30;
	}
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
}
public class program27_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        test1 obj =new test1();//as soon as creating the obj it will get initialized
         //obj.assign(10, 10);
         obj.display();
	}

}

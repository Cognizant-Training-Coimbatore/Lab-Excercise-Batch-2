class moverr{
	int x=10 ;
	int y=20 ;
	void display()
	{

		System.out.println(x+y);
	}
	void display(int a, int b)
	{
		x=a;
		y=b;
		System.out.println(x+y);
	}
}
public class Moverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
moverr xx=new moverr();
xx.display();
xx.display(8,7);
	}

}

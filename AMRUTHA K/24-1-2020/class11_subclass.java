package demo11;
class a{
	int a=4;
}
class b extends a{
	int c=3;
	void display() {
		System.out.println(a+c);
	}
}
public class class11_subclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b ob=new b();
		ob.display();

	}

}

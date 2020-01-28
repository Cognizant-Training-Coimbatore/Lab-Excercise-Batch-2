class a1{
	int x=10;
}
class b1 extends a1{
	int x=100;
	void dislplay()
	{
		System.out.println(super.x);
	}
}
public class program25_super_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      b1 ob = new b1();
      ob.dislplay();
	}

}

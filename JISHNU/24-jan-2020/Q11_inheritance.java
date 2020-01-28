package day3;
class a
{
	int a=5;
}
class b extends a
{
	int b=5+a;
}
public class Q11_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b obj=new b();
		a obj1=new a();
		int c=obj.b;
		int d=obj1.a;
		System.out.println(c+" "+d);

	}

}

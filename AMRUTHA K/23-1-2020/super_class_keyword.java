package demo;
class a1{
	int x=10;
}
class b1 extends a1{
	int x=19;
	void dispaly() {
		System.out.println(super.x);//to avoid overriding of sub class over super class we give the key word super
	}
}
public class super_class_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 obj=new b1();
		obj.dispaly();
		

	}

}

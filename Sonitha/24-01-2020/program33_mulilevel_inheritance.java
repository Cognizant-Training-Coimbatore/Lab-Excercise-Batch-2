class t1{
	int a=2;
	
}
class t2 extends t1{
	int b=5;
	
}
class t3 extends t2{
	int c =a+b;
	void dis() {
		System.out.println(c);
	}
}
public class program33_mulilevel_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       t3 ob =new t3();
       ob.dis();
	}

}

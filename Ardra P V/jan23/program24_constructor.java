class test1{
	int a,b;
	void assign(int x,int y) {
		a=x;
		b=y;
	}
	
  test1(){
	a=10;
	b=20;
	  
  }
	
	
	
	void dispay() {
System.out.println(a);
System.out.println(b);
	}}
public class program24_constructor {

	public void main(String[] args) {
		// TODO Auto-generated method stub
		test1 t=new test1();
		t.assign(2, 3);
        t.dispay();
	}

}


class test{
	int x;
	void assign(int p) {
		x=p;
	}
	void display() {
		System.out.println(x);
		//System.out.println(p);
	}
}



public class program22_define_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   test obj=new test();
   obj.assign(5);
   obj.display();
		
	}

}

class sample3{
	int i;
	void display() {
		i++;
		System.out.println(i);
	}
}
public class program28_static_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample3 obj=new sample3();
		obj.display();
		sample3 obj1=new sample3();
		obj1.display();
		

	}

}

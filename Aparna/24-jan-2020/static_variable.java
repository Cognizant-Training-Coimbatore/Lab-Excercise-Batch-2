class sample12
{
	static int   i;
	void display() {
		i++;
		System.out.println(i);
	}
}
public class static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sample12 obj=new sample12();
sample12 obj1 =new  sample12();
obj.display();
obj1.display();
	}

}

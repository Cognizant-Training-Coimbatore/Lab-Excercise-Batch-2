class stat
{
	static int i;
	void display() {
		i++;
		System.out.println(i);
	}
}








public class program21_static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
stat obj1=new stat();
obj1.display();
stat obj2=new stat();
obj2.display();
	}

}

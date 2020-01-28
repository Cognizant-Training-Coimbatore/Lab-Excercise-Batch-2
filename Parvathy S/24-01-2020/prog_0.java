class a
{
	int x=1;
}
class b extends a
{
	int y=1;
}
class inherit extends b
{
	int z=1;
	int s=x+y+z;
	void display()
	{
		System.out.println(s);
	}
}
public class prog_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        inherit obj = new inherit();
        obj.display();
	}

}

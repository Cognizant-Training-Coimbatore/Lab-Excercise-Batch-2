class pgming
{
	void newpgm()
	{
		System.out.println("Ilove programming");
	}
	void newpgm(String str)
	{
		System.out.println("Ilove " +str);
	}
}
public class new_pgming {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pgming obj=new pgming();
		obj.newpgm();
		pgming obj1=new pgming();
		obj1.newpgm("cats");
		

	}

}

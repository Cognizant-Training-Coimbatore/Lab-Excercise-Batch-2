package gokul;
class stat
{
	static int i=100;
	static int product(int x,int y)
	{ 
		return x*y;
	}
	}

public class program63_staticvar_methods {

	public static void main(String[] args) {
int ans=stat.product(5,4);
System.out.println(ans);
int a=stat.i;
System.out.println(a);
	}

}

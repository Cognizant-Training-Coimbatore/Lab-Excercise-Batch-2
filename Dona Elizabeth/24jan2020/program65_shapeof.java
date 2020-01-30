class shape{
	void sh() {
		System.out.println("This is the shape");
		
	}
}

class rectangle extends shape{
	void rect() {
		System.out.println("This is a rectangular shape");
		
	}
}

class circle extends shape{
	void cir()
	{
		System.out.println("This is a circular shape");
	}
}


class square extends rectangle
{
	void sq()
	{
		System.out.println("square is a rectangle");
	}
}
public class program65_shapeof {

	public static void main(String[] args) {
		square obj=new square();
		obj.sh();
		obj.rect();
	}

}

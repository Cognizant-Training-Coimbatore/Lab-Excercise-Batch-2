


class shape{
	void sh() {
		System.out.println("This is this shape");
		
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

public class program_shape_rect_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
square obj=new square();
obj.sh();
obj.rect();
	}

}









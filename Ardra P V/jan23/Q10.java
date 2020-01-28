class area2{
	int findArea(int a ,int b) {
	  return a*b;	
	}
	int findArea(int a) {
		
		return a*a;
	}
}
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          area2 ar=new area2();
          ar.findArea(10, 20);
          ar.findArea(30);
          System.out.println("Area of rectangle : " +ar.findArea(30));
          System.out.println("Area of rectangle : " +ar.findArea(10, 20));
	}

}

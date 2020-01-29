package demo;
class geometry{
	int x,y;
	void area(int a) {
		x=a*a;
		
	}
	void area(int a,int b) {
		y=a*b;
	}
	void display() {
		System.out.println("area of squre="+x+"\n area of rectangle="+y);

	}
	
	
}
public class class10_areaof_sqre_rect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		geometry obj=new geometry();
		obj.area(12);
		obj.area(15, 10);
		obj.display();
		
		
	}

}

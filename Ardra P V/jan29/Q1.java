package apache;
import apache.Q2;

public interface Q1 {
	void rectangle();
	void sportcar();

}
class example implements Q1{

	@Override
	public void rectangle() {
		// TODO Auto-generated method stub
		int l=2,b=3;
		int area=l*b;
		System.out.println(area);
		
	}

	@Override
	public void sportcar() {
		// TODO Auto-generated method stub
		int car=2;
		System.out.println(car);
		
	}
	public static void main(String[] args) {
		example x=new example();
		x.rectangle();
		x.sportcar();
		
	}}
	




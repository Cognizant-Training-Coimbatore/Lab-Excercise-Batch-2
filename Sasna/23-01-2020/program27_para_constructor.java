class calc {
	int a , b;
	calc (int x, int y){
		a = x;
		b = y;
	}
	
	void sumOfNumbers() {
		System.out.println(a+b);
	}
}
public class program27_para_constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calc obj = new calc(5, 9);
		obj.sumOfNumbers();
	}

}

package Package4;
class Apple {
	 void apple() {
	  System.out.println("Apple is a fruit");
	 }
	}
	class Apple_pie extends Apple {
	 void applepie() {
	  System.out.println("Apple pie made out of apple");
	 }
	}
	class Apple_juice extends Apple_pie {
	 void applejuice() {
	  System.out.println("Apple juice made of apple and apple pie");
	 }
	}
public class program127_set7_q3 {

	public static void main(String[] args) {
		  Apple_juice obj = new Apple_juice();
		  obj.apple();
		  obj.applepie();
		  obj.applejuice();
		

	}

}

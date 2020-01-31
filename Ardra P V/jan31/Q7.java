package jan31;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		System.out.println("Number divisible by 3 ");
		for(i=1;i<=100;i++) {
			if((i%3== 0)) {
				System.out.println(i);
			}

	}
		System.out.println("Number divisible by 11 ");
		for(i=1;i<=100;i++) {
			if((i%11== 0)) {
				System.out.println(i);
			}

	}
		System.out.println("Number divisible by 3 and 11 ");
		for(i=1;i<=100;i++) {
			if((i%11 == 0) && (i%3 == 0) ) {
				System.out.println(i);
			}

	}

}
}

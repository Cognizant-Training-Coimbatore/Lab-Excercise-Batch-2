import java.util.Random;

public class question9_random_number {

	public static void main(String[] args) {
		Random randomnu=new Random();
		int number = randomnu.nextInt(999);
		System.out.println(number);

	}

}

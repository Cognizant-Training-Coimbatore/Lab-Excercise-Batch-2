
public class program17_nest_if_ladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks = 95;
		if (marks > 90 && marks <101) {
			System.out.println("grade A");
		}
		else if(marks >81 && marks <91) {
			System.out.println("grade b");
		}
		else if(marks > 70 && marks <81) {
			System.out.println("grade c");
		}
		else if(marks > 60 && marks <71) {
			System.out.println("grade d");
		}
		else if(marks >50 && marks <61) {
			System.out.println("grade e");
		}
		else {
			System.out.println("fail");
		}
	}

}

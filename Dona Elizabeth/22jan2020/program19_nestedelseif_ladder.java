
public class program19_nestedelseif_ladder {

	public static void main(String[] args) {
		int mark=95;
		if(mark>=95)
		{
			System.out.println("Grade A+");
		}
		else if(mark>=90&&mark<95)
		{
			System.out.println("Grade A");
		}
		else if(mark>=80&&mark<90)
		{
			System.out.println("Grade B+");
		}
		else if (mark>=70&&mark<80)
		{
			System.out.println("Grade B");
		}
		else if (mark>=50&&mark<70)
		{
			System.out.println("Grade Pass");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}

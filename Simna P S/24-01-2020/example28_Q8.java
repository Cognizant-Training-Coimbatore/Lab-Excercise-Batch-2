import java.util.Scanner;

public class example28_Q8 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = in.nextLine();

        
		int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        System.out.print("Number of  Vowels in the string: " + count);
        

	}

}

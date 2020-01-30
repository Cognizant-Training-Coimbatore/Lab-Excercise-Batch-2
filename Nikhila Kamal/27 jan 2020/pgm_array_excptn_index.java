
public class pgm_array_excptn_index {

	public static void main(String[] args) {
		try
		{
			int a[]=new int[5];
			System.out.println("Access element seven" + a[7]);
		}
		
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Exception thrown:" + e);
			}
			System.out.println("out of the block");
		}

	
	}



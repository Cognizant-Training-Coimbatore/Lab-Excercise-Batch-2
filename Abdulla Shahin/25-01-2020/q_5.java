public class q_5 {

	public static void main(String[] args)
	{
		String name[] = new String[5];
		name[0] = "sam";
		name[1] = "ram";
		name[2] = "cam";
		name[3] = "dam";
		name[4] = "nam";
		for(int i=0;i<5;i++)
		{
			name[i] = name[i].toUpperCase();
		}
		for(int i=0;i<5;i++)
		{
			System.out.println(name[i]);
		}
	}

}

package practical_exercises;

public class qn_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,j;
for(j=1;j<=100;j++)
{
	if((j%3==0) || (j%11==0))
			{
		System.out.println(j);
			} }
for(i=1;i<=100;i++)
{
	if((i%3==0) && (i%11==0))
			{
		System.out.println(i);
			}
}
	}

}

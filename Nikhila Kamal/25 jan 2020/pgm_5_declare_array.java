
public class pgm_5_declare_array {

	public static void main(String[] args) {
		String a[]=new String[5];
		a[0]="Nikhila";
		a[1]="akhila";
		a[2]="anu";
		a[3]="meenu";
		a[4]="malu";
		for(int i=0;i<5;i++)
		{
			a[i]=a[i].toUpperCase();
		}
		for(int i=0;i<5;i++)
		{
		System.out.println("friends:" +a[i]);
		}

	}

}

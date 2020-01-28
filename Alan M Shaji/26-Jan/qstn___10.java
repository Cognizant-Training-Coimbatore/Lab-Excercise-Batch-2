import java.io.FileReader;

public class qstn___10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fout= new FileReader("D:\\myfile2.csv");
		int c;
		while((c=fout.read())!=-1)
			System.out.print((char)c);
	}

}

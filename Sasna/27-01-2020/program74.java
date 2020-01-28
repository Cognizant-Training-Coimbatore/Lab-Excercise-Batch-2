import java.io.FileInputStream;
class fileMgMt {
	void fileRead() throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("B:/myfile.txt");
		int k;
		while((k= fis.read()) != -1) {
			System.out.print((char)k);
		}
		fis.close();
	}
}



public class program74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

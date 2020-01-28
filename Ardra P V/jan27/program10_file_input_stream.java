import java.io.DataInput;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class program10_file_input_stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fstream=new FileInputStream("D:\\myfile.txt");
        DataInputStream fin =new DataInputStream(fstream);
        while(fin.available()!=0) {
        	System.out.println(fin.readLine());
        }
	}catch (Exception e) {
		System.err.println("File error");
	}

}
}

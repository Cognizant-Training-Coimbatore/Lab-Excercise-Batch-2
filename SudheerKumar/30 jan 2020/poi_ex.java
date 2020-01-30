package apache;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poi_ex {

	public static void main(String[] args) throws IOException {
		XSSFWorkbook wk=new XSFFWorkbook();
		FileOutputStream file=new FileOutputStream("example.xls");
		wk.write(file);
		System.out.println("file created");
		file.close();// TODO Auto-generated method stub

	}

}

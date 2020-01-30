package apache;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Po_Ex {

	public static void main(String[] args) throws Exception {
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("Table1.xlsx"));
		wk.write(file);
		file.close();
		System.out.println("file created");
	}

}

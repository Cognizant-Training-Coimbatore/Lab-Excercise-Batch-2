package day7Apache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		XSSFWorkbook work1 = new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("example.xlsx"));
		work1.write(file);
		file.close();
		work1.close();
		System.out.println("File created");
	}

}

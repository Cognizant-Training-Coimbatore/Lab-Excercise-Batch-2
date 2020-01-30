package project1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class poiex1_29 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook wk = new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("sample2.xlsx"));
		wk.write(file);
		file.close();
		System.out.println("File created....");
	}

}

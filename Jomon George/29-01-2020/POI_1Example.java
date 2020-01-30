package Apache;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		XSSFWorkbook wk = new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("example.xlsx"));
		wk.write(file);
		file.close();
		System.out.println("File created");
		wk.close();
	}

}


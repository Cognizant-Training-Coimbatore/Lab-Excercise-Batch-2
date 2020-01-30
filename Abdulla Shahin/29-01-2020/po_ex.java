package apache_poi;

//import java.io.File;

import java.io.FileOutputStream;

//import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class po_ex {

	public static void main(String[] args) throws Exception
	{
		
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream file = new FileOutputStream(new File("ex.xlsx"));
		wk.write(file);
		file.close();
		System.out.println("file created");
	}

}

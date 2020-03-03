package apache;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class demo1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("sample1.xlsx"));
		wk.write(file);
		file.close();	
		System.out.println("file created");
	}

}

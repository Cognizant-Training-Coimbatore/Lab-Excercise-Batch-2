package abc;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class date29_abc {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook obj=new XSSFWorkbook();
		FileOutputStream file=new FileOutputStream(new File("sample2.xlsx"));
		obj.write(file);
		file.close();
		System.out.println("file created");
	}

}

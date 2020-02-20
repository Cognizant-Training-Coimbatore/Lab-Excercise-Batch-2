package excelFileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel_File{
public Sheet readExcel(String filePath,String fileName,String sheetName) throws IOException {
	File file=new File(filePath+"//"+fileName);
	FileInputStream ip=new FileInputStream(file);
	Workbook wb=null;
	String fileExtension=fileName.substring(fileName.indexOf(""));
	if(fileExtension.equals(".xlsx"))
			wb=new XSSFWorkbook(ip);
	else if(fileExtension.equals(".xls"))
			wb=new HSSFWorkbook(ip);
	Sheet sh=wb.getSheet(sheetName);
	return sh;
}
}

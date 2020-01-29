package samplepackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {

	public static void main(String[] args) {
		
// Create Blank workbook
XSSFWorkbook wk = new XSSFWorkbook();

//Create blank sheet
XSSFSheet sheet =wk.createSheet("Data");//sheetname:Data

//This data needs to be written
Map<String, Object[]> data = new TreeMap<String, Object[]>();//keyValue pairing
data.put("sno",new Object[] { "First Name","Last Name"});
data.put("1",new Object[] { "sample","xyza"});

Set<String> set =data.keySet();//
int rowno=0;
for(String k:set) {
	Row row = sheet.createRow(rowno++);
	Object[] obj = data.get(k);
	int cellno = 0;
	for(Object ob :obj) {
		Cell cell = row.createCell(cellno++);
		if(ob instanceof String)//
			cell.setCellValue((String)ob);
		else if (ob instanceof Integer)
			cell.setCellValue((Integer)ob);
		
	}
}
try
{
	FileOutputStream out = new FileOutputStream(new File("Name.xlsx"));
	wk.write(out);
	System.out.println("File Written Successfully");
}
catch (Exception e) {
	e.printStackTrace();
}
	}

}

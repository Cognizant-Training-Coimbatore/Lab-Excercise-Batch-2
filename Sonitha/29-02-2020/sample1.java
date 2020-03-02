package apache_poi_excel_data_driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class sample1 
{

	public static void main(String[] args) throws IOException 
	{
		FileInputStream file = new FileInputStream("C:\\Users\\Admin\\Documents\\ApachePOI_XLSX_File.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet Sheet = workbook.getSheetAt(0);
		
		int NoOfRows = Sheet.getLastRowNum();
		int NoOfCols = Sheet.getRow(0).getLastCellNum();//here cell denotes the number of rows
		
		for(int i=0;i<NoOfRows;i++)
		{
			XSSFRow currentrow = Sheet.getRow(i);
			for(int j=0;j<NoOfCols;j++)
			{
				System.out.println(currentrow.getCell(j).toString());
			}
		}

	}

}

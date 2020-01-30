package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class write_excel {

	public static void main(String[] args) 
	{
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet st = wk.createSheet("Data");
		Map<String,Object[]> data = new TreeMap<String,Object[]>();
		data.put("1",new Object[] {"First name","Last name"});
		data.put("2",new Object[] {"abc","xyz"});
		data.put("3",new Object[] {"ewr","mee"});
		data.put("4",new Object[] {"dwe","eee"});
		Set<String> s = data.keySet();
		int rowno = 0;
		for(String k:s) 
		{
			Row row = st.createRow(rowno++);
			Object[] obj = data.get(k);
			int cellno=0;
			for(Object obb:obj)
			{
					Cell cell = row.createCell(cellno++);
					if(obb instanceof String)
					{
						cell.setCellValue((String)obb);
						
					}
					else if(obb instanceof Integer)
					{
						cell.setCellValue((Integer)obb);
					}
			}
		}	
			try
			{
				FileOutputStream file = new FileOutputStream(new File("Name.xlsx"));
				wk.write(file);
				file.close();
				System.out.println("file Written ");
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		

	}

}

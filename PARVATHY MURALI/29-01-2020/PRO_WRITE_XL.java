package packone;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PRO_WRITE_XL 
{

	public static void main(String[] args) 
	{
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet st=wk.createSheet("Data_1");
		Map<String,Object[]> data=new TreeMap<String, Object[]>();
		data.put("Sno", new Object[] {"First Name","Last Name"});
		data.put("1",new Object[] {"Sample","Xyza"});
		Set<String> st1=data.keySet();
		int rowno=0;
		for(String k:st1)
		{
			Row row=st.createRow(rowno++);
			Object[]obj=data.get(k);
			int cellno=0;
			for(Object ooj:obj)
			{
				Cell cell=row.createCell(cellno++);
				if(ooj instanceof String)
				{
					cell.setCellValue((String)ooj);
				}
				else if(ooj instanceof Integer)
				{
					cell.setCellValue((Integer)ooj);
				}
			}
		}
			try
			{
				FileOutputStream file=new FileOutputStream(new File("Namenm.xlsx"));
				wk.write(file);
				file.close();
				System.out.println("file created");
			}
			catch(Exception e)
			{
				e.printStackTrace();

			}
			
	
		
		
		

	}

}

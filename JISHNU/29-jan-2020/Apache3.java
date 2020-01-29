package javasersion8;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet st=wk.createSheet("Data");
		Map<String, Object[]> data=new TreeMap<String, Object[]>();
		data.put("1",new Object[] {"First name","Last name"});
		data.put("2",new Object[] {"zsf","asfs"});
		data.put("3",new Object[] {"zsjf","asfs"});
		data.put("4",new Object[] {"zsjjf","asfs"});
		Set<String> set=data.keySet();
		int rowno=0;
		for(String k:set)
		{
			Row row=st.createRow(rowno++);
			Object[] obj=data.get(k);
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
			FileOutputStream out=new FileOutputStream(new File("new.xlsx"));
			wk.write(out);
			out.close();
			System.out.println("File created");
		}
		catch(Exception e)
		{
			
		}
		
	}

}
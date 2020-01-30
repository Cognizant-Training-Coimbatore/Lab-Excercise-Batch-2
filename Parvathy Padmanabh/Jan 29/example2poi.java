package apache;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class example2poi 
{

	public static void main(String[] args) throws IOException
	{
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet st = wk.createSheet("Data");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"Name", "Number"});
		data.put("2", new Object[] {"Parvathy", "9075216271"});
		data.put("3", new Object[] {"Parvathy", "9075216271"});
		data.put("4", new Object[] {"Parvathy", "9075216271"});
		data.put("5", new Object[] {"Parvathy", "9075216271"});
		Set<String> set = data.keySet();
		int r=0;
		for(String k: set)
		{
			Row row = st.createRow(r++);
			Object[] obj = data.get(k);
			int col=0;
			for(Object obj1:obj)
			{
				Cell cell = row.createCell(col++);
				if(obj1 instanceof String)
				{
					cell.setCellValue((String)obj1);
				}
				else if (obj1 instanceof Integer)
				{
					cell.setCellValue((Integer)obj1);
				}
			}	
		}
	try
	{
		FileOutputStream out = new FileOutputStream(new File("Name.xlsx"));
		wk.write(out);
		out.close();
		System.out.println("Created");
	}
	catch (Exception e)
	{
		System.out.println(e);
	}
	wk.close();
	}
}

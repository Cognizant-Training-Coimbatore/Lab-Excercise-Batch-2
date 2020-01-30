package Apache;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class POI_WriteExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		XSSFWorkbook wk = new XSSFWorkbook();
		XSSFSheet st = wk.createSheet("Data");
		Map<String, Object[]> data = new TreeMap<String, Object[]>();
		data.put("1", new Object[] {"First Name","Last Name"});
		data.put("2", new Object[] {"sample","XYZ"});
		
//		System.out.println(data);
		Set<String> set = data.keySet();
//		System.out.println(set);
		int rowno = 0;
		for(String k: set)
		{
			Row row = st.createRow(rowno++);
			Object[] obj = data.get(k);
			int cellno = 0;
			for(Object ooj : obj)
			{
				Cell cell = row.createCell(cellno++);
				if(ooj instanceof String)
					cell.setCellValue((String)ooj);
				else if(ooj instanceof Integer)
					cell.setCellValue((Integer)ooj);
			}
		}
		try {			
			FileOutputStream out = new FileOutputStream(new File("Name.xlsx"));
			wk.write(out);
			out.close();
			System.out.println("File Written Successfully");
			wk.close();
		}
		catch(Exception e){e.printStackTrace();}
		
	}
	

}

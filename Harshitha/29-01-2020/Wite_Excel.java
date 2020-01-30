package Project;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wite_Excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet st=wk.createSheet("Data");
		Map<String,Object[]> data=new TreeMap<String,Object[]>();
		data.put("SLNO",new Object[] {"First Name","Last Name"});
		data.put("1",new Object[] {"Harshitha","Bose"});
		data.put("2",new Object[] {"Sruti","Laju"});
		data.put("3",new Object[] {"Shyam","Kumar"});
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
					cell.setCellValue((String)ooj);
				else if(ooj instanceof Integer)
					cell.setCellValue((Integer)ooj);
			}
		}
		
			try {
				FileOutputStream out=new FileOutputStream(new File("Name.xlsx"));
				wk.write(out);
				out.close();
				System.out.println("File created");
		        }
			catch(Exception e)
			{
				e.printStackTrace();		
			
		}
		
	}

}

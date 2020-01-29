package project1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_Excel {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		XSSFSheet sheet=wk.createSheet("Data_2");
		Map<String,Object[]> data=new TreeMap<String,Object[]>();
		data.put("Sno.", new Object[] {"Firstname" ,"Lastname"});
		data.put("1",new Object[] {"Sample","Xyza"});
		Set<String> st=data.keySet();
		int rowno=0;
		for(String k:st)
		{
			Row row=sheet.createRow(rowno++);
			Object[] obj=data.get(k);
			int celno=0;
			for(Object ooj:obj)
			{
				Cell cell=row.createCell(celno++);
				if(ooj instanceof String)
					cell.setCellValue((String)ooj);
				else if(ooj instanceof Integer)
					cell.setCellValue((Integer)ooj);
			
				
			}
		}
		try
		{
			FileOutputStream out=new FileOutputStream(new File("Name_3.xlsx"));
			wk.write(out);;
			out.close();
			System.out.println("File written successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}

}

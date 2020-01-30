package apache1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apache_2 {

	public static void main(String[] args) {
		XSSFWorkbook wk=new XSSFWorkbook(); //going to create a workbook
		XSSFSheet st=wk.createSheet("Data");  //sheet inside workbook
		Map<String, Object[]>data=new TreeMap<String,Object[]>(); //key to value mapping
		data.put("Sl no",new Object[] {"First Name","Last Name"});
		data.put("1",new Object[] {"Sample","Parvati"});
		
		Set<String>set=data.keySet();
		int rowno=0;
		for(String k:set)
		{
			Row row=st.createRow(rowno++); //apply the value in a particular cell
			Object[] obj=data.get(k);
			int cellno=0;for(Object ooj:obj)
			{
				Cell cell=row.createCell(cellno++);
				if(ooj instanceof String) 
					cell.setCellValue((String)ooj); 
					else if(ooj instanceof Integer)
						cell.setCellValue((Integer)ooj);
			}
		}
		try
		{
			FileOutputStream out=new FileOutputStream(new File("pp.xlsx"));
		wk.write(out);
			out.close();
			System.out.println("File written successfully..");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	

}}

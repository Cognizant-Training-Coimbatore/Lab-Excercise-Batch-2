package appoch1;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_xcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook obj=new XSSFWorkbook();//created awork book
		XSSFSheet sheet=obj.createSheet("data");//create a excelsheet named data
		Map<String, Object[]>data=new TreeMap<String, Object[]>();
		data.put("s1", new Object[] {"firstname","lastname"});
		data.put("s2", new Object[] {"subject","mark"});
		Set<String>st=data.keySet();//setting the output
		System.out.println(st);
		int rowno=0;
		for(String k:st)
		{
			Row row=sheet.createRow(rowno++);
			Object[]obj1=data.get(k);
			int cellno=0;
			for (Object ooj:obj1)
			{
				Cell cell=row.createCell(cellno++);
				if(ooj instanceof String)//convert object format into string format
					cell.setCellValue((String)ooj);
				else if(ooj instanceof Integer)
					cell.setCellValue((Integer)ooj);
			}
		}
		try {
			FileOutputStream out=new FileOutputStream(new File("name.xlsx"));
			obj.write(out);
			obj.close();
			System.out.println("created");
		   }
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}

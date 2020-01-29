package apache;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_ecxel {

	public static void main(String[] args) {
		
		XSSFWorkbook wb=new XSSFWorkbook();
      	XSSFSheet st=wb.createSheet("Data");
      	Map<String, Object[]> data=new TreeMap<String, Object[]>();
      	data.put("sno",new Object[] { "First name", "Last name"});
      	data.put("1", new Object[] {"Sample","xyza"});
      	data.put("2", new Object[] {"Simple","blaa"});
        Set<String> set=data.keySet();
        int rowno=0;
        for(String k:set) {
        	Row row=st.createRow(rowno++);
        	Object[] obj=data.get(k);
        	int cellno=0;
        	for(Object ooj:obj) {
        		Cell cell=row.createCell(cellno++);
        		if(ooj instanceof String)
        			cell.setCellValue((String) ooj);
        		else if(ooj instanceof Integer)    
        			cell.setCellValue((Integer) ooj);
        		}
        }
        try {
        	FileOutputStream out=new FileOutputStream(new File("name.xlsx"));
        	wb.write(out);
    		out.close();
    		System.out.println("file created");

        }catch(Exception e) {
        	System.out.println("error");
        }
	}

}

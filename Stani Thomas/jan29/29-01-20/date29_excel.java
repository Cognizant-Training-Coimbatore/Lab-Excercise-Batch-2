package abc;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.charts.XSSFScatterChartData;

public class date29_excel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
XSSFWorkbook wk=new XSSFWorkbook();
XSSFSheet st=wk.createSheet("data");
Map<String, Object> data=new TreeMap<String, Object>();
data.put("sno",new Object[]{"stani","thomas"});
data.put("1",new Object[] {"first name","last name"});

Set<String> set=data.keySet();
int rowno=0;
for(String k:set)
{
	Row row=st.createRow(rowno++);
	Object[] obj= (Object[]) data.get(k);
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
try
{
	FileOutputStream out=new FileOutputStream(new File("name.xlsx"));
	wk.write(out);
	out.close();
System.out.println("file written successfully");
}
catch(Exception e)
{
	e.printStackTrace();
}
	}

		
	}



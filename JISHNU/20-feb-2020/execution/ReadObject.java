package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
	Properties prop=new Properties();
	public Properties getProp() throws IOException
	{
		InputStream is=new FileInputStream("E:\\javanewwork space\\keyworddrivern\\src\\keywordfeb19\\fbproperties.properties");
		prop.load(is);
		return prop;
	}

}

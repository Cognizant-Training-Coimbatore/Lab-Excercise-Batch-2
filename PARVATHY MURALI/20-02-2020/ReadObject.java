package execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject
{
	Properties prop=new Properties();
	public Properties getProp() throws IOException
	{
		InputStream is=new FileInputStream("C:\\Users\\Admin\\Desktop\\java parvathym\\keyword\\src\\keyword_driven\\FB_Properties.properties");
		prop.load(is);//load the contant of property file
		return prop;
	}
}

package Execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject 
{
	Properties prop=new Properties();
	public Properties getProp() throws IOException
	{
		InputStream is=new FileInputStream("C:\\Users\\Admin\\Desktop\\java prgms\\Keyword_Driven_Framework\\src\\keywordDriven\\fbProperties.properties");
		prop.load(is);
		return prop;
	}
}

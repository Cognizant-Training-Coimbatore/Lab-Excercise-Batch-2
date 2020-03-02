package Execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
Properties prop=new Properties();
public Properties getProp() throws IOException
{
	InputStream is=new FileInputStream("E:\\\\Java programs\\\\keyword_driven\\\\src\\\\ObjectProperty\\\\FBProperties.properties");
	prop.load(is);
	return prop;
			}
}

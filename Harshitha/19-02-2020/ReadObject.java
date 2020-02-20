package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
Properties prop=new Properties();
public Properties getProp() throws IOException
{
	InputStream is=new FileInputStream("D:\\Java Programs\\Keyword_driven\\src\\pkg\\FB_properties.properties");
	prop.load(is);
	return prop;
}
}

package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadObject {
Properties prop=new Properties();
public Properties getProp() throws IOException
{
	InputStream is=new FileInputStream("C:\\Users\\Admin\\Desktop\\java pgmng\\keyword_driven\\src\\keyword\\fb_properties.properties");
	prop.load(is);
	return prop;
			}
}

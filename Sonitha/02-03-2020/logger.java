import org.apache.log4j.Logger;

public class logger 
{
	static Logger log = Logger.getLogger(logger.class.getName());
	public void writelog(String s)
	{
		log.info(s);
	}

}

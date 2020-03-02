import org.apache.log4j.Logger;

public class logger {
		// TODO Auto-generated constructor stub
		static Logger log = Logger.getLogger(logger.class.getName());
		public static void writeLog(String s)
		{
			log.info(s);
			}
		}


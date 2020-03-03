import org.apache.log4j.Logger;

public class looger {
	  static Logger log=Logger.getLogger(looger.class.getName());
	  void writelog(String s)
	  {
		  log.info(s);
	  }
}

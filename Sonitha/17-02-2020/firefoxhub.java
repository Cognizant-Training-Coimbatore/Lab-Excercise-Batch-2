import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class firefoxhub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		static WebDriver driver;
		static String nodeURL;
		public static void main(String[] args) throws MalformedURLException{
			// TODO Auto-generated method stub
	        nodeURL = "http://172.27.0.205.5555/wd/hub";
	     System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
	        capabilities.setBrowserName("firefox");
	        capabilities.setPlatform(Platform.WINDOWS);
	        driver = new RemoteWebDriver(new URL("http://172.27.0.205.5555/wd/hub"),capabilities);
	        driver.get("http://demowebshop.tricentis.com");
	        driver.findElement(By.linkText("Register")).click();
		}

	}

}

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class gridchrome 
{
	static WebDriver driver;
	static String nodeURL;
	public static void main(String[] args) throws MalformedURLException
	{
		nodeURL="http://192.168.20.48:4444/wd/hub";
		//System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://192.168.20.48:4444/wd/hub"),capabilities);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();

	}

}

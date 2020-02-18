import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 
{
	static WebDriver driver;
	static String nodeURL;

	public static void main(String[] args) throws MalformedURLException
	{
		nodeURL ="http://192.168.20.11:32531/wd/hub";
		//nodeURL ="http://192.168.20.13:37353/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		
		

	}

}

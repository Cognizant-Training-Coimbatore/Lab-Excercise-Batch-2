import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {
	static WebDriver driver;
	static String nodeURL,nodeURL1,nodeURL2;
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		nodeURL="http://192.168.20.28:31728/wd/hub";
		nodeURL1="http://192.168.20.31:21736/wd/hub";
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL),capabilities);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver=new RemoteWebDriver(new URL(nodeURL1),capabilities);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		
		
	}

}

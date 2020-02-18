import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid1 {
	static WebDriver driver;
	static String nodeURL;
	

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		nodeURL="http://192.168.20.45:6970/wd/hub";
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setBrowserName("firefox");
		capabilities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL("http://192.168.20.45:6970/wd/hub"),capabilities);
		driver.get("http://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Jishnu");
		Thread.sleep(3000);
		driver.quit();

	}

}

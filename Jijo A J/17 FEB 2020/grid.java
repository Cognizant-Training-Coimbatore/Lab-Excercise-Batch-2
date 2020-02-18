import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class grid{
static WebDriver driver;
    static String nodeURL;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
				
		nodeURL = "http://192.168.20.52:4444/wd/hub";
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
        driver = new RemoteWebDriver(new URL(nodeURL), capabilities);
		driver.get("https://www.youtube.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("messi");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		
	}}
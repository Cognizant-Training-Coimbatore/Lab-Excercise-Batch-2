package podemo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class hub1 {
	static WebDriver driver;
	static String nodeURL;
	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		nodeURL="http://192.168.20.28:23506/wd/hub";
		
		DesiredCapabilities capacities=DesiredCapabilities.chrome();
		capacities.setBrowserName("chrome");
		capacities.setPlatform(Platform.WINDOWS);
		driver=new RemoteWebDriver(new URL(nodeURL), capacities);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		
		

	}

}

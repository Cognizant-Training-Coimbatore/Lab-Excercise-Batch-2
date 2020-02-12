import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class multiscreenshot_file {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MultiScreenShot screen=new MultiScreenShot("E:\\Anjana\\", "Multi_screenshot");
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver, driver.findElement(By.xpath("//*[@id=\"hplogo\"]")));
		driver.close();
	}

}

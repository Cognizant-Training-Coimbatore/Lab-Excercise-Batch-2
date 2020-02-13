import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import multiScreenShot.MultiScreenShot;

public class multiss {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		MultiScreenShot screen=new MultiScreenShot("C:\\Users\\admin\\Desktop\\Java programs CBE\\Webdriver-Demo\\Screenshot\\","Multiscreenshot_File");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Java programs CBE\\Webdriver-Demo\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com/");
		screen.multiScreenShot(driver);
		screen.elementScreenShot(driver, driver.findElement(By.xpath("//*[@id=\"logo-default\"]")));
		

	}

}
